import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       Lib one = new Lib();
       System.out.println("Choose an option:\n1. \"Welcome Class!\"\n2. \"Can I Have Your Daughter's Hand?\"\n3.\"Wacky Star Wars\"");
       one.setChoice(scan.nextInt());
       one.setChoice(1);
       boolean repeat = true;
       while (repeat){
            System.out.print("enter 1 to change story and enter 2 to fill in and print your story: ");
            if(scan.nextInt()==1){
                System.out.print("Choose an option:\n1. \"Welcome Class!\"\n2. \"Can I Have Your Daughter's Hand?\"\n3.\"Wacky Star Wars\"");
                one.setChoice(scan.nextInt());
            } else{
                if(one.getChoice()==1) {
                    one.print1();
                } else if (one.getChoice()==2) {
                    one.print2();
                }else {
                    one.print3();
                }
                System.out.print(one + "\n"+one.getPrint());
                repeat = false;
            }
        }
    }
}