package string_;
public class starts_with {
    public static void main(String[] args) {
     String name = "Niloy Ahmed";
        System.out.println(name);
        String name2 = "N";
        System.out.println(name2);
        
        boolean starts=name.startsWith(name2);
        System.out.println(starts);
        
        if(starts==true){
            System.out.println("This is true.");
        }
        else{
            System.out.println("This is false.");
        }
    
}}
