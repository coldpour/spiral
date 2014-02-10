import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SpiralTest {

    @Test
    public void test0 () {
        int[][] expected = new int[1][1];
        expected[0][0] = 0;
        verifyArrayEquals(expected, new Spiral(0).getArray());
    }

    @Test
    public void test1() {
        int[][] expected = new int[2][2];
        expected[0][0] = 0; expected[0][1] = 0;
        expected[1][0] = 1; expected[1][1] = 0;
        verifyArrayEquals(expected, new Spiral(1).getArray());
    }

    @Test
    public void test2() {
        int[][] expected = new int[2][2];
        expected[0][0] = 2; expected[0][1] = 0;
        expected[1][0] = 1; expected[1][1] = 0;
        verifyArrayEquals(expected, new Spiral(2).getArray());
    }

    @Test
    public void test3() {
        int[][] expected = new int[2][2];
        expected[0][0] = 2; expected[0][1] = 3;
        expected[1][0] = 1; expected[1][1] = 0;
        verifyArrayEquals(expected, new Spiral(3).getArray());
    }

    @Test
    public void test8() {
        int[][] expected = new int[3][3];
        expected[0][0] = 6; expected[0][1] = 7; expected[0][2] = 8;
        expected[1][0] = 5; expected[1][1] = 0; expected[1][2] = 1;
        expected[2][0] = 4; expected[2][1] = 3; expected[2][2] = 2;
        verifyArrayEquals(expected, new Spiral(8).getArray());
    }

    @Test
    public void test24() {
        int[][] expected = new int[5][5];
        expected[0][0] = 20; expected[0][1] = 21; expected[0][2] = 22; expected[0][3] = 23; expected[0][4] = 24;
        expected[1][0] = 19; expected[1][1] = 6;  expected[1][2] = 7;  expected[1][3] = 8;  expected[1][4] = 9;
        expected[2][0] = 18; expected[2][1] = 5;  expected[2][2] = 0;  expected[2][3] = 1;  expected[2][4] = 10;
        expected[3][0] = 17; expected[3][1] = 4;  expected[3][2] = 3;  expected[3][3] = 2;  expected[3][4] = 11;
        expected[4][0] = 16; expected[4][1] = 15; expected[4][2] = 14; expected[4][3] = 13; expected[4][4] = 12;
        verifyArrayEquals(expected, new Spiral(24).getArray());
    }

    @Test
    public void testNegative() {
        int[][] expected = new int[0][0];
        verifyArrayEquals(expected, new Spiral(-2).getArray());
    }

    private void verifyArrayEquals(int[][] expected, int[][] actual) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected\n");
        stringBuilder.append(Array.toString(expected));
        stringBuilder.append("Actual\n");
        stringBuilder.append(Array.toString(actual));
        stringBuilder.append("Arrays are not equal");
        assertArrayEquals(stringBuilder.toString(), expected, actual);
    }
}
