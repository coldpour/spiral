public class Spiral {
    public static int[][] spiral(int in) {
        final int include_zero = in + 1;
        final int width = (int) Math.sqrt(include_zero);
        final int levels = (int) Math.ceil(width/2.0);

        int counter = 0;
        int[][] container = new int[width][width];
        for (int center = levels - 1, level = center; level >= 0; level--) {
            for (int y = level + 1, bottom = width - 1 - level; y <= bottom; y++) {
                int x = width - 1 - level;
                container[y][x] = counter++;
            }
            for (int x = width - 2 - level, left = level; x >= left; x--) {
                int y = width - 1 - level;
                container[y][x] = counter++;
            }
            for (int y = width - 2 - level, top = level + 1; y >= top; y--) {
                int x = level;
                container[y][x] = counter++;
            }
            for (int x = level, right = width - 1 - level; x <= right; x++) {
                int y = level;
                container[y][x] = counter++;
            }
        }
        return container;
    }

}
