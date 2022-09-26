
package Basic;

public class Constructor_overloading { 
    public static void main(String[] args) {
        Constructor_overloading obj=new Constructor_overloading();
        System.out.println(obj);
        obj=new Constructor_overloading(7);
        System.out.println(obj);
        obj=new Constructor_overloading(1,2);
        System.out.println(obj);
    }
Constructor_overloading(){
    System.out.println("This is constructor 0");
}
Constructor_overloading(int a){
    System.out.println("This is constructor 1"); 
}
Constructor_overloading(int a,int b) {
    System.out.println("This is constructor 2");
}
}