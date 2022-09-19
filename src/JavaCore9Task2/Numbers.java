package JavaCore9Task2;

public class Numbers {
    int first;
    int second;
    public Numbers(int first, int second)throws IncorrectNumbers{
        if (first%1!=0){
            throw new IncorrectNumbers();
        }if (second%1!=0){
            throw new IncorrectNumbers();
        }
        this.first=first;
        this.second=second;

    }
}
