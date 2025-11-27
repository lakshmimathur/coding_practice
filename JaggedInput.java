import java.util.*;
public class JaggedInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of rows:");
        int row = sc.nextInt();
        int arr[][] = new int[row][];

        for(int i=0; i<row; i++){
            System.out.print("Enter the size of sub-array" +(i+1)+ ":");
            int subArraySize = sc.nextInt();
            arr[i] = new int[subArraySize];
        }

        for(int i = 0; i<row; i++){
            System.out.print("Enter the elements of jagged Array" +(i+1)+ ":");
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Jagged Array is:");
        for(int i=0; i<row; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();

        }
        sc.close();

    }
}
