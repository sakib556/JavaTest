package array;
import java.util.Scanner;
public class array_1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter array size : ");
        int arr[] = new int [s.nextInt()];
 
        for(int x=0;x<arr.length;x++){
            System.out.print("Enter index "+x+" = ");
            arr[x]=s.nextInt();
        }
        
        System.out.println("First input - First Output (FIFO) : ");
        for(int x=0;x<arr.length;x++){
            System.out.println("Index "+x+" = "+arr[x]);
           
        }    
    }
    
}
