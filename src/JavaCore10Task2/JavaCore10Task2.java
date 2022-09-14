package JavaCore10Task2;

import java.util.Scanner;

public class JavaCore10Task2 {
    public static void main(String[] args) {
    int max=0;
    int min=0;
    System.out.println("Enter few words");
    Scanner scanner=new Scanner(System.in);
    String word=scanner.nextLine();
    String[] fewWords=word.split("");
        for(int i=1; i<fewWords.length; i++){
            if (fewWords[i].length()>fewWords[max].length()){
                    max=i;
        } else if(fewWords[i].length()<fewWords[max].length()){
                min=i;
            }
    }
        System.out.println(max);
        System.out.println(min);

}
}

