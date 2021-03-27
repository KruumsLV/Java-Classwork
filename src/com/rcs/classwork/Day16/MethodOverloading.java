package com.rcs.classwork.Day16;

public class MethodOverloading {

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        // return x + y = z;
        return sum(x, y) + z;
    }

    public static int sum(int x, int y, int z, int b) {
        return sum(x, y, z) + b;
    }

    public static float sum(float x, float y) {
        return x + y;
    }

    public static float sum(float x, float y, float z) {
        return sum(x, y) + z;
    }

    public static void main(String[] args) {
        // Izveidot sum(...) metodes, kuras
        // atgriež parametru summas.
        // Nepieciešamas sekojošas implementācijas:
        // sum(1, 2);
        // sum(1, 2, 3);
        // sum(3f, 2f);
        // sum(3f, 5f, 1f);

        System.out.println(sum(23, 512));
        System.out.println(sum(23, 52, 12));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(2.51f, 3.23f));
        System.out.println(sum(4.11f, 5.1235f, 6.141f));
    }

}
