package JavaCore9Task1;

import java.util.Scanner;

public class Lesson9Task1JavaCore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            Number a = new Number(sc.nextInt());
            System.out.println(a);
            Number b = new Number(sc.nextInt());
            System.out.println(b);
        } catch (IncorrectNumber n) {
            System.out.println(n.getMessage());
        }

    }


}
