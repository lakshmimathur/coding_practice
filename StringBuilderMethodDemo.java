public class StringBuilderMethodDemo {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Geeks for Geeks");
        System.out.println("Initial StringBuilder:" +sb);
        sb.append(" is Awesome");
        System.out.println("After append:" +sb);

        System.out.println(sb.length());
        System.out.println(sb.insert(26, " java Also"));
        System.out.println(sb.replace(26, sb.length(), " python also"));
        System.out.println(sb.reverse());
        System.out.println(sb.charAt(5));

    }
}
