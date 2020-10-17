// filename : SimpleConstructor.java

import java.util.*;

class Rock {
    Rock() {
        System.out.println("Creating Rock");
    }
    Rock(int i) {
        System.out.println("Creating Rock " + i);
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        Rock tmp0 = new Rock();
        Rock tmp1 = new Rock(7);
        return;
    }
}