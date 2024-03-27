//2) Program to demonstrate scope of Variable 

import java.util.Scanner;

public class ScopeVariable {
    String data;

    public static void main(String[] args) {
        ScopeVariable s = new ScopeVariable();
        s.data = "Students";
        System.out.println("Scope variable is: " + s.data);

    }

}
