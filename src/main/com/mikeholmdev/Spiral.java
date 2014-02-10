package com.mikeholmdev;

public class Spiral {
    private int width;
    private int center;
    private int[][] container;
    private int counter;
    private int input;

    public Spiral(int input) {
        this.input = input;
        determineWidth();
        findCenter();
        fillContainer();
    }

    public String toString() {
        return Array.toString(container);
    }

    public int[][] getArray() {
        return container;
    }

    private void determineWidth() {
        int include_zero = input + 1;
        width = (int) Math.sqrt(findNextSquare(include_zero));
    }

    private int findNextSquare(int i) {
        while (!isSquare(i)) {
            i++;
        }
        return i;
    }

    private boolean isSquare(int i) {
        return 0.0 == (Math.sqrt(i) % 1);
    }

    private void findCenter() {
        center = (int) Math.floor(width / 2.0);
    }

    private void fillContainer() {
        container = new int[width][width];
        counter = 0;
        for (int level = center; level >= 0; level--) {
            fillDown(level);
            fillLeft(level);
            fillUp(level);
            fillRight(level);
        }
    }

    private void fillDown(int level) {
        int top = level + 1;
        int bottom = width - 1 - level;
        int x = width - 1 - level;
        for (int y = top; y <= bottom; y++) {
            fillAt(x, y);
        }
    }

    private void fillLeft(int level) {
        int right = width - 2 - level;
        int left = level;
        int y = width - 1 - level;
        for (int x = right; x >= left; x--) {
            fillAt(x, y);
        }
    }

    private void fillUp(int level) {
        int bottom = width - 2 - level;
        int top = level + 1;
        int x = level;
        for (int y = bottom; y >= top; y--) {
            fillAt(x, y);
        }
    }

    private void fillRight(int level) {
        int left = level;
        int right = width - 1 - level;
        int y = level;
        for (int x = left; x <= right; x++) {
            fillAt(x, y);
        }
    }

    private void fillAt(int x, int y) {
        if (counter <= input) {
            container[y][x] = counter++;
        }
    }

    public static void main(String[] args) {
        for (String arg: args) {
            try {
                int input = Integer.parseInt(arg);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("\n");
                stringBuilder.append("The spiral for your input value of ");
                stringBuilder.append(input);
                stringBuilder.append(" looks like this:\n\n");
                stringBuilder.append(new Spiral(input).toString());
                System.out.println(stringBuilder.toString());
            } catch (NumberFormatException e) {
                System.err.println("Failed trying to parse a non-numeric argument, " + arg);
            }
        }
    }
}
