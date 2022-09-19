package JavaCore9Task3;

import JavaCore9Task2.IncorrectNumbers;
import JavaCore9Task2.Numbers;

import java.util.Scanner;

public class JavaCore9Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a&b");

        try{
            Methods method=new Methods(sc.nextInt(), sc.nextInt());
            System.out.println(method.a + method.b);
        }
        catch (IllegalArgumentException n){
            System.out.println(n.getMessage());
        }
        catch (ArithmeticException n){
            System.out.println(n.getMessage());
        }
        catch (IllegalAccessException n){
            System.out.println(n.getMessage());
        }
        catch (MyException n){
            System.out.println(n.getMessage());
        }

    }
}
