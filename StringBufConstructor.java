public class StringBufConstructor {
    public static void main(String[] args){
        StringBuffer str1 = new StringBuffer();
        str1.append("Hello");
        System.out.println("Default constructor:" +str1);

        StringBuffer str2 = new StringBuffer(50);
        str2.append("Java Programming");
        System.out.println("With capacity 50:" +str2);

        StringBuffer str3 = new StringBuffer("Welcome");
        str3.append("to java");
        System.out.println("With String:" +str3);
    }
}
