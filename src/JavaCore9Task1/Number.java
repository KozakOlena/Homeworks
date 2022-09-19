package JavaCore9Task1;

public class Number {
    int numb;

    public Number(int nextInt)throws IncorrectNumber {

        if (numb % 2 == 0) {
            System.out.println("Pair number");
        } else if (numb % 2 != 0) {
            System.out.println("Odd number");
        } if (numb % 1 != 0) {
            throw new IncorrectNumber();

        }
        this.numb = numb;
    }
}





