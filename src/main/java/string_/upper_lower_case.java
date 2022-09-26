package string_;
public class upper_lower_case {
      public static void main(String[] args) {
          String name = "Niloy Ahmed";
          System.out.println(name);
        
          String replace = name.replace('i','y');
          System.out.println("Replace i to y : "+replace);
        
          String lowercase = name.toLowerCase();
          String uppercase = name.toUpperCase();
        
          System.out.println("Lowercase : "+lowercase);
          System.out.println("Uppercase : "+uppercase);
      }
}
