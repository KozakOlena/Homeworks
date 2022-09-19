package JavaCore9Task3;


public class Methods {
    int a;
    int b;

    public Methods(int a,int b)throws IllegalArgumentException,ArithmeticException,IllegalAccessException,MyException{

        if (a<0 && b<0) {
            throw new IllegalArgumentException();
        } if (a==0 && b!=0 || a!=0&& b==0) {
            throw new ArithmeticException();
        } if (a==0 && b==0) {
            throw new IllegalAccessException();
        }
        if(a>0 &&b>0){
            throw new MyException();

        }
        this.a = a;
        this.b = b;
    }
}

