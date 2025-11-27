public class StringBufferMethod {
    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer("Hello ");
        sb1.append("Java");
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.replace(0, 3, "Welcome"));
        System.out.println(sb1.charAt(4));
        System.out.println(sb1.delete(0, 2));
        System.out.println(sb1.insert(0, "We"));


    }
}
