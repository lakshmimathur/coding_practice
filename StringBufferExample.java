
public class StringBufferExample {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer();
        str.append("Hello");
        str.append(" ");
        str.append("World");

        String s = str.toString();
        System.out.println(s);

    }


}
