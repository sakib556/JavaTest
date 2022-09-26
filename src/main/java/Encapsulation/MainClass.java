package Encapsulation;
public class MainClass extends capsul{
    public static void main(String[] args) {
    MainClass cap = new MainClass();
    cap.setA(1);
      System.out.print(cap.getA());
    }  
}
class capsul{
    private int a,b;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }    
}
