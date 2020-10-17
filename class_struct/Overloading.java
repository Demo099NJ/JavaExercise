// filename : Overloading.java

import java.util.*;

class Tree {
    private int height;
    private String name;

    public Tree() {
        height = 0;
        name = new String("Pine");
        System.out.println("Planting a seedling.");
    }

    public Tree(int h) {
        height = h;
        name = new String("Pine");
        //this();
        System.out.println("Planting a new " + name + " tree that is " + height + " feet tall.");
    }

    public Tree(String n) {
        height = 0;
        name = n;
        System.out.println("Planting a new " + name + " tree that is " + height + " feet tail.");
    }

    public Tree(int h, String n) {
        this(h);
        name = n;
        //this(n);
        //height = h;
        System.out.println("Planting a new " + name + " tree that is " + height + " feet tail.");
    }

    public void info() {
        System.out.println("Tree is " + height + " feet tail.");
    }

    public void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tail.");
    }
}

public class Overloading {
    public static void main(String[] args) {
        Tree tmp0 = new Tree();
        tmp0.info();
        tmp0.info("Overloading method");

        Tree tmp1 = new Tree(100);
        tmp1.info();
        tmp1.info("Overloading method");
        return;
    }
}