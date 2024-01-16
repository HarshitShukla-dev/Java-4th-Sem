import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.println(name + " " + age + " " + salary);
        
        sc.close(); // Close the Scanner object
    }    
}

// JDK -- JRE + tools
// JRE -- JVM + libs

// compiled code turns into bytecode
// java keywords--
// public -- an access modifier---> public, default, private, protected
// void -- return type
// static -- keyword
// jvm --> Main.main([])
// array ----> list of strings