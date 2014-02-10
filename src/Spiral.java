public class Spiral {
    private int width;
    private int center;
    private int[][] container;
    private int counter;

    public Spiral(int i) {
        determineWidth(i);
        findCenter();
        fillContainer();
    }

    public String toString() {
        return Array.toString(container);
    }

    public int[][] getArray() {
        return container;
    }

    private void determineWidth(int i) {
        int include_zero = i + 1;
        width = (int) Math.sqrt(include_zero);
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
            container[y][x] = counter++;
        }
    }

    private void fillLeft(int level) {
        int right = width - 2 - level;
        int left = level;
        int y = width - 1 - level;
        for (int x = right; x >= left; x--) {
            container[y][x] = counter++;
        }
    }

    private void fillUp(int level) {
        int bottom = width - 2 - level;
        int top = level + 1;
        int x = level;
        for (int y = bottom; y >= top; y--) {
            container[y][x] = counter++;
        }
    }

    private void fillRight(int level) {
        int left = level;
        int right = width - 1 - level;
        int y = level;
        for (int x = left; x <= right; x++) {
            container[y][x] = counter++;
        }
    }

}
