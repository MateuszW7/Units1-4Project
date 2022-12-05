import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int choice = 0;
       System.out.println("Choose an option:\n1. \"Welcome Class!\"\n2. \"Can I Have Your Daughter's Hand?\"\n3.\"Wacky Star Wars\"");
       choice = scan.nextInt();
       if(choice>0 && choice<4){
           Lib one = new Lib(choice);
       }else{
           Lib one = new Lib();
       }

    }
}