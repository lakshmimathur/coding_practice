public class StringClassConstructor {
    public static void main(String[] args){
//        constructor1 creating string using new keyword;
        String str = new String("Hello World");
        System.out.println("String using new keyword:" +str);

//        constructor2 creating string from character array
        char[] charArray = {'J', 'A', 'V', 'A'};
        String str2 = new String(charArray);
        System.out.println("String using charArray:" +str2);

//        constructor3 creating string from byte array

        byte[] byteArray = {72, 101,108, 108, 111};
        String str3 = new String(byteArray);
        System.out.println("string using byte array:" +str3);

    }
}
