package Basic;
public class Exam {
    public static void main(String[] args) {
        Exam e=new Exam();
        e=new Exam(2);
        e=new Exam(1,2);
        e=new Exam(1,2,3);  
        
    }
    Exam(){
        String name=" Kazi Shakib Uddin.";
        int age = 21;
        int salary = 25;
        System.out.println("Name : "+name+", Age: "+age+", Salary : "+salary+"k");
}
    Exam(int a){
         String name=" Niloy Ahmed.";
        int age = 17;
        int salary = 35;
        System.out.println("Name : "+name+", Age: "+age+", Salary : "+salary+"k");
}
    Exam(int a,int b){
         String name=" Shourav Ahmed.";
        int age = 20;
        int salary = 45;
        System.out.println("Name : "+name+", Age: "+age+", Salary : "+salary+"k");
}

    Exam(int a,int b,int c){
         String name=" Mohammad Hafez.";
        int age = 17;
        int salary = 35;
        System.out.println("Name : "+name+", Age: "+age+", Salary : "+salary+"k");
}
    
    
}
