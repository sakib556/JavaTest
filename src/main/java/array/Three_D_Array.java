package array;
import java.util.Scanner;
public class Three_D_Array {
    static int x,y,z,arr[][][];
    Scanner s= new Scanner(System.in);
    
    public static void main(String[] args) {
        Three_D_Array m=new Three_D_Array();
        m.inputmethod();
        int l=arr.length;
        for(x=0;x<l;x++){
            for(y=0;y<l;y++){
            for(z=0;z<l;z++){
                m.showmethod();
            }
          }    
        }
        
        System.out.println("FIFO");
        for(x=0;x<l;x++){
            for(y=0;y<l;y++){
            for(z=0;z<l;z++){
                m.showmethod2();
            }
          }    
        }   
        System.out.println("LIFO");
        for(x=l;x>0;){
            x--;
            for(y=l;y>0;){
                y--;
            for(z=l;z>0;){
                z--;
                m.showmethod2();
            }
          }    
        }   
  }
    void inputmethod(){
        System.out.println("Enter 3d array size : ");
        arr = new int[s.nextInt()][s.nextInt()][s.nextInt()];
    }
    void showmethod(){
        System.out.print("Input Index "+"["+x+"]"+"["+y+"]"+"["+z+"]"+" = ");
        arr[x][y][z]=s.nextInt();
    }
    void showmethod2(){
                    System.out.println("Index "+"["+x+"]"+"["+y+"]"+"["+z+"]"+" = "+arr[x][y][z]);
    }
    
}
