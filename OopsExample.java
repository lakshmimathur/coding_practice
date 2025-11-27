import java.io.*;
import java.io.*;

class Number{
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public void sum(){
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a-b);
    }
    public static void main(String[] args){
        Number obj = new Number();
        obj.setA(1);
        obj.setB(2);
        obj.sum();
        obj.sub();

    }
}
public class OopsExample {
    public static void main(String[] args){
        System.out.println("GFG");

    }
}
