import java.util.*;

public class Hello{
    
    public void greet(){
        System.out.println("Hello World from an object!");
    }
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("Hello " + name + ", nice to meet you");
        
        Hello hello = new Hello();

        hello.greet();

        System.out.println("Mr. Stafford is bad at wordle");
    }
}