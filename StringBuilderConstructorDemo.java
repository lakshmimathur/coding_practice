public class StringBuilderConstructorDemo {
    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder(); //StringBuilder constructor
        sb1.append("hello");
        System.out.println("sb1:" +sb1);

        StringBuilder sb2 = new StringBuilder(50); //StringBuilder with capacity constructor
        sb2.append("This has initial capacity 50");
        System.out.println("sb2:" +sb2);

        StringBuilder sb3 = new StringBuilder("Geeks"); //with string constructor
        sb3.append("for Geeks");
        System.out.println("sb3:" +sb3);

        CharSequence cs = "Java";//charSequence constructor
        StringBuilder sb4 = new StringBuilder(cs);
        sb4.append(" Programming");
        System.out.println("sb4:" +sb4);

    }
}
