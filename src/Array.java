public class Array {
    public static String format(int[][] a) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int y = 0, y_end = a.length; y < y_end; y++) {
            for (int x = 0, x_end = a[y].length; x < x_end; x++) {
                stringBuilder.append("\t");
                stringBuilder.append(a[y][x]);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
