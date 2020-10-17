// filename : ArrayNew.java

import java.util.*;

class PrintArray {
    public void print_one(Object[] x) {
        for (int i = 0; i < x.length; ++i) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        return;
    }

    public void print_two(Object[][] x) {
        for (int i = 0; i < x.length; ++i) {
            print_one(x[i]);
        }
        return;
    }

    public void print_three(Object[][][] x) {
        for (int i = 0; i < x.length; ++i) {
            print_two(x[i]);
        }
        return;
    }
}

class A {
    private int i;

    public A() {
        i = 0;
    }

    public A(int val) {
        i = val;
    }
}

class VarArgs {
    private PrintArray printer = new PrintArray();

    public void test() {
        printer.print_one(new Object[] {
            17,//new Integer(17),
            new VarArgs(),
            3.14,//new Float(3.14),
            11.11//new Double(11.11)
        });

        printer.print_one(new Object[] { "one", "two", "three" });
        printer.print_one(new Object[] { new A(), new A(1), new A(2) });
    }
}

class MultiDimArray {
    private Random rand = new Random();
    private PrintArray printer = new PrintArray();
    
    public void test() {
        Integer[][] a1 = {
            { 1, 2, 3, },
            { 4, 5, 6, }
        };
        printer.print_two(a1);

        Integer[][][] a2 = new Integer[2][3][4];
        printer.print_three(a2);

        // 3-D array with varied-length vectors
        Integer[][][] a3 = new Integer[rand.nextInt(7)][][];
        for (int i = 0; i < a3.length; ++i) {
            a3[i] = new Integer[rand.nextInt(6)][];
            for (int j = 0; j < a3[i].length; ++j) {
                a3[i][j] = new Integer[rand.nextInt(5)];
            }
        }
        printer.print_three(a3);

        return;
    }
}

public class ArrayNew {
    private static Random rand = new Random();
    private static PrintArray printer = new PrintArray();

    private static VarArgs va = new VarArgs();
    private static MultiDimArray ma = new MultiDimArray();

    public static void main(String[] args) {
        Integer[] a = new Integer[rand.nextInt(20)];
        printer.print_one((Object[])a);

        va.test();
        ma.test();

        return;
    }
}
