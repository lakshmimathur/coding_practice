import java.util.Arrays;
public class BinarySearchArrayClass {
    public static void main(String[] args){
        int arr[] = {10,30,25,20, 35};
        Arrays.sort(arr);
        int key = 25;

        System.out.println(
                key +  " found at index:" +Arrays.binarySearch(arr, key));

    }
}
