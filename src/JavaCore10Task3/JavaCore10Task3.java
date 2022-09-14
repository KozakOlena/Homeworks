package JavaCore10Task3;

import java.util.Scanner;

public class JavaCore10Task3 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter word");
        String word=scanner.nextLine();
        String[] words=word.split("");
        for (int i=1; i<words.length;i++) {
            if(words[i].charAt(0) == 'a' && (words[i].length()%2==0)) {
                System.out.println(words[i]);
            }
        }

}
}
