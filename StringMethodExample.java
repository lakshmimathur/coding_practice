public class StringMethodExample {
    public static void main(String[] args){
        String str = "Hello,World ";
        System.out.println(str.length()); //print the length of string

        System.out.println(str.charAt(7)); // 7th index character of string

        System.out.println(str.substring(4)); //print substring from index 4
        System.out.println(str.substring(4, 7)); //substring of specific index
        System.out.println(str.concat("!!!")); // adding another string
        System.out.println(str.indexOf("world")); //index of world;
        System.out.println(str.indexOf("l", 4)); //index of l from specified index 4
        System.out.println(str.lastIndexOf("l")); //last index of l in string
        System.out.println(str.equals("Hello,World")); //checking both string are same
        System.out.println(str.equalsIgnoreCase("hello,world"));
        System.out.println(str.compareTo("Hello,Java")); //checking value of strings difference between W and j is 13
        System.out.println(str.toLowerCase()); //converting string into lower case
        System.out.println(str.toUpperCase()); //converting string into upper case
        System.out.println("'" +str.trim() + "'");//removing white spaces
        System.out.println(str.replace("l", "x")); //replace l to x
        System.out.println(str.contains("World")); //checking World present in string

    }
}
