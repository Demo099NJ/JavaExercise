// exercise.java

import java.util.*;

class IfElse {
    public boolean test(int testval, int begin, int end) {
        boolean sign = true;
        if (begin > end) {
            int temp = begin;
            begin = end;
            end = temp;
        }
        if (testval > begin && testval < end) {
            sign = true;
        }
        else {
            sign = false;
        }
        return sign;
    }
}

class WhileTest {
    public boolean test(int begin, int end) {
        if (begin >= end) {
            return false;
        }
        int temp_iter = begin;
        while (temp_iter < end) {
            System.out.println(temp_iter);
            ++temp_iter;
        }
        return true;
    }
}

class ForTest {
    public boolean test(int begin, int end) {
        if (begin >= end) {
            return false;
        }
        for (int i = begin; i < end; ++i) {
            System.out.println(i);
        }
        return true;
    }
}

public class Exercise {
    private static IfElse if_else = new IfElse();
    private static WhileTest while_test = new WhileTest();
    private static ForTest for_test = new ForTest();

    public static void main(String[] args) {
        System.out.println(if_else.test(12, 0, 10));
        while_test.test(0, 100);
        for_test.test(0, 100);
        return;
    }
}