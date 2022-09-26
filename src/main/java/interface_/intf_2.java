package interface_;
public class intf_2 extends intf_1 {
    public static void main(String[] args) {
        intf_2 obj=new intf_2();
        System.out.println("Main method starts.");
        obj.fileA();
        obj.fileB();
        obj.fileC();
        int a=obj.add(2,3);
        System.out.println(a);    
    }
     @Override
    public void fileA() {
        System.out.println("File A ");    }
     @Override
    public void fileB() {
        System.out.println("File B ");    }
     @Override
    public void fileC() {
        System.out.println("File C ");    }
}
