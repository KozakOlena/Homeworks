package JavaCore9Task2;

import java.util.Scanner;

public class JavaCore9Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number&second");

        try{
            Numbers numbers=new Numbers(sc.nextInt(), sc.nextInt());
            System.out.println(numbers.first+ numbers.second);
        }
        catch (IncorrectNumbers n){
            System.out.println(n.getMessage());
        }

    }
}
