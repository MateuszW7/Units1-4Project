import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lib one = new Lib();
        int userchoice;
        System.out.println("Choose an option:\n1. \"Welcome Class!\"\n2. \"Can I Have Your Daughter's Hand?\"\n3.\"Wacky Star Wars\"");
        userchoice = scan.nextInt();
        one.setChoice(userchoice);
        boolean repeat = true;
        while (repeat) {
            System.out.println("enter 1 to change story \nenter 2 to fill in and print your story ");
            userchoice = scan.nextInt();
            if (userchoice == 1) {
                System.out.print("Choose an option:\n1. \"Welcome Class!\"\n2. \"Can I Have Your Daughter's Hand?\"\n3.\"Wacky Star Wars\"");
                one.setChoice(scan.nextInt());
            } else {
                if (one.getChoice() == 3) {
                    one.print3();
                }
                if (one.getChoice() == 1) {
                    one.print1();
                }
                if(one.getChoice() == 2){
                    one.print2();
                }
                System.out.print(one + "\n" + one.getPrint());
                repeat = false;
                    }
                }
    }
}