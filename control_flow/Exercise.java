// Exercise.java

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
            System.out.print(temp_iter);
			System.out.print(" ");
			if (temp_iter == 47) {
				break;
			}
            ++temp_iter;
        }
		System.out.println();
        return true;
    }
}

class ForTest {
    public boolean test(int begin, int end) {
        if (begin >= end) {
            return false;
        }
        for (int i = begin; i < end; ++i) {
            System.out.print(i);
			System.out.print(" ");
			if (i == 47) {
				System.out.println();
				return true;
			}
        }
		System.out.println();
        return true;
    }
}

class TwoStringCompare {
	private String str_first = new String();
	private String str_second = new String();

	public boolean stringEqual(String str0, String str1) {
		if (str0.length() != str1.length()) {
			return false;
		}

		int len = str0.length();
		for (int i = 0; i < len; ++i) {
			if (str0.charAt(i) != str1.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public boolean stringNotEqual(String  str0, String str1) {
		return !stringEqual(str0, str1);
	}

	public boolean stringGreater(String str0, String str1) {
		int len = Math.min(str0.length(), str1.length());
		for (int i = 0; i < len; ++i) {
			if (str0.charAt(i) > str1.charAt(i)) {
				return true;
			}
			else if (str0.charAt(i) < str1.charAt(i)) {
				return false;
			}
		}
		return (str0.length() > str1.length());
	}

	public boolean stringLess(String str0, String str1) {
		return stringGreater(str1, str0);
	}

	public boolean stringGreaterOrEqual(String str0, String str1) {
		return !stringLess(str0, str1);
	}

	public boolean stringLessOrEqual(String str0, String str1) {
		return !stringGreater(str0, str1);
	}
}

class RandomInteger {
	private int random_array[] = new int[25];
	private int len = 25;

	public void generateRandomArray() {
		for (int i = 0; i < len; ++i) {
			random_array[i] = (int)(Math.random() * 100);
		}
		
		// show the array
		for (int i = 0; i < len; ++i) {
			System.out.print(random_array[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}

class SwitchTest {
	public void test(int val) {
		String str = new String();
		switch (val) {
			case 0: str = "This is zero."; break;
			case 1: str = "This is one."; break;
			case 2: str = "This is two."; break;
			case 3: str = "This is three."; break;
			case 4: str = "This is four."; break;
			case 5: str = "This is five."; break;
			case 6: str = "This is six."; break;
			case 7: str = "This is seven."; break;
			case 8: str = "This is eight."; break;
			case 9: str = "This is nine."; break;
			case 10: str = "This is ten."; break;
			default: str = "Greater than ten."; break;
		}
		System.out.println(str);
	}
}

public class Exercise {
    private static IfElse if_else = new IfElse();
    private static WhileTest while_test = new WhileTest();
    private static ForTest for_test = new ForTest();
	private static TwoStringCompare two_string_compare = new TwoStringCompare();
	private static RandomInteger random_integer = new RandomInteger();
	private static SwitchTest switch_test = new SwitchTest();

    public static void main(String[] args) {
        System.out.println(if_else.test(12, 0, 10));
        while_test.test(0, 100);
        for_test.test(0, 100);
		switch_test.test(7);
        return;
    }
}
