import java.util.Scanner;
public class Lib {
    //instance variables
    private String Lib1 = "-----Welcome Class!-----\nHello everybody! W1 W2 here. \nGonna W3 W4 to you about W5. So far we've learned through most of the W6 unit, except for W5. So the W5 allows a W7 W8 to W9 the value of a W6. You will see more of this in the W10. Hope that's W11!";
    private String Lib2 = "-----Can I Have Your Daughter's Hand?-----Dear Mr. and Mrs. W1 W2,\n\nWill you let me marry your W3? Ever since I have laid eyes on W3, I have W4 madly in love with her. I wish that she will be the W5 of my W6 and that someday we will W7 happily ever after. I have a job as a/an W8 that pays $W9 each month. I promise to W10 W3 with kindness and respect.\n\nSincerely,\nW11 W12";
    private String Lib3 = "-----Wacky Star Wars-----\nDarth W1 looked at his master while his W2 breathing filled the room. He was told to go to W3 evrything on the planet of W4. He got in his W5 and jumped to hyperspace. Soon before he reached the planet, he dropped out of hyperspace and was attacked by Rebel W6. He W7 them off and continued to the planet`s surface. He landed and confronted more opposition, slicing it down with his W8. He used the W9 to choke another Rebel, then W10 him aside. He finished off all life on the planet with a/an W11 laugh.";
    private int choice = 0;
    private String print = "";

    //constructors

    public Lib(){
        choice = 0;
    }
    public Lib(int choice){
        this.choice = choice;
    }


    //public methods

    public void setChoice(int choice){
        this.choice = choice;
    }
    public String getPrint(){
        return print;
    }

    public int getChoice(){
        return choice;
    }
    public void print1(){
        Scanner scan = new Scanner(System.in);
            System.out.print("Please enter an adjective");
            Lib1 = replace("W1", Lib1, adjective(scan.nextLine()));
            System.out.print("Please enter a name");
            Lib1 = replace("W2", Lib1, name(scan.nextLine()));
            System.out.print("Please enter an adjective");
            Lib1 = replace("W3", Lib1, adjective(scan.nextLine()));
            System.out.print("Please enter a verb");
            Lib1 = replace("W4", Lib1, verb(scan.nextLine()));
            System.out.print("Please enter a noun");
            Lib1 = replace("W5", Lib1, noun(scan.nextLine()));
            System.out.print("Please enter a silly word");
            Lib1 = replace("W6", Lib1, sillyWord(scan.nextLine()));
            System.out.print("Please enter an adjective");
            Lib1 = replace("W7", Lib1, adjective(scan.nextLine()));
            System.out.print("Please enter a noun");
            Lib1 = replace("W8", Lib1, noun(scan.nextLine()));
            System.out.print("Please enter a verb");
            Lib1 = replace("W9", Lib1, verb(scan.nextLine()));
            System.out.print("Please enter a noun");
            Lib1 = replace("W10", Lib1, noun(scan.nextLine()));
            System.out.print("Please enter an adjective");
            Lib1 = replace("W11", Lib1, adjective(scan.nextLine()));
            print = Lib1;
        }

    public void print2(){
        Scanner scan = new Scanner(System.in);
            System.out.print("Please enter an adjective");
            Lib2 = replace("W1", Lib2, adjective(scan.nextLine()));
            System.out.print("Please enter a name");
            Lib2 = replace("W2", Lib2, name(scan.nextLine()));
            System.out.print("Please enter a noun");
            Lib2 = replace("W3", Lib2, noun(scan.nextLine()));
            System.out.print("Please enter a past tense verb");
            Lib2 = replace("W4", Lib2, verbPast(scan.nextLine()));
            System.out.print("Please enter a noun");
            Lib2 = replace("W5", Lib2, noun(scan.nextLine()));
            System.out.print("Please enter a noun");
            Lib2 = replace("W6", Lib2, noun(scan.nextLine()));
            System.out.print("Please enter a verb");
            Lib2 = replace("W7", Lib2, verb(scan.nextLine()));
            System.out.print("Please enter a job");
            Lib2 = replace("W8", Lib2, job(scan.nextLine()));
            System.out.print("Please enter a number");
            Lib2 = replace("W9", Lib2, number(scan.nextDouble()));
            System.out.print("Please enter a verb");
            Lib2 = replace("W10", Lib2, verb(scan.nextLine()));
            System.out.print("Please enter an adjective");
            Lib2 = replace("W11", Lib2, adjective(scan.nextLine()));
            System.out.print("Please enter a name");
            Lib2 = replace("W12", Lib2, name(scan.nextLine()));
            print = Lib2;
        }

    public void print3(){
        Scanner scan = new Scanner(System.in);
            System.out.print("Please enter a name");
            Lib3 = replace("W1", Lib3, name(scan.nextLine()));
            System.out.print("Please enter an adjective");
            Lib3 = replace("W2", Lib3, adjective(scan.nextLine()));
            System.out.print("Please enter a verb");
            Lib3 = replace("W3", Lib3, verb(scan.nextLine()));
            System.out.print("Please enter a silly word");
            Lib3 = replace("W4", Lib3, sillyWord(scan.nextLine()));
            System.out.print("Please enter a noun");
            Lib3 = replace("W5", Lib3, noun(scan.nextLine()));
            System.out.print("Please enter a plural noun");
            Lib3 = replace("W6", Lib3, nounPlur(scan.nextLine()));
            System.out.print("Please enter a past tense verb");
            Lib3 = replace("W7", Lib3, verbPast(scan.nextLine()));
            System.out.print("Please enter a noun");
            Lib3 = replace("W8", Lib3, noun(scan.nextLine()));
            System.out.print("Please enter a noun");
            Lib3 = replace("W9", Lib3, noun(scan.nextLine()));
            System.out.print("Please enter a past tense verb");
            Lib3 = replace("W10", Lib3, verbPast(scan.nextLine()));
            System.out.print("Please enter an adjective");
            Lib3 = replace("W11", Lib3, adjective(scan.nextLine()));
            print = Lib3;
        }

    public String toString(){
        return choice + "";
    }

    //private helper methods
    private String verbPast(String verbPast) { //past tense verb
        if (verbPast.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "fell";
            } else if (random == 2) {
                return "painted";
            } else {
                return "programmed";
            }
        } else {
            return verbPast;
        }
    }
    private String noun(String noun) { //noun
        if (noun.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "bookshelf";
            } else if (random == 2) {
                return "ink cartridge";
            } else {
                return "space ship";
            }
        } else {
            return noun;
        }
    }
    private String job(String job) { //job
        if (job.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "game dev";
            } else if (random == 2) {
                return "pencil sharpener";
            } else {
                return "roller coaster tester";
            }
        } else {
            return job;
        }
    }
    private String number(double number) { //number
        if(number != -1){
            return "" + number;
        }else{
            return Math.pow((int)(Math.random()*10),2)*24 + "";
        }
    }

    private String verb(String verb) { //verb
        if (verb.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "laugh";
            } else if (random == 2) {
                return "live";
            } else {
                return "compute";
            }
        } else {
            return verb;
        }
    }
    private String adjective(String adjective) { //adjective
        if (adjective.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "immense";
            } else if (random == 2) {
                return "ellated";
            } else {
                return "scruffy";
            }
        } else {
            return adjective;
        }
    }
    private String name(String name) { //name
        if (name.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "Billy Bobblehead";
            } else if (random == 2) {
                return "Katniss Everdeen";
            } else {
                return "Nathan Folwell";
            }
        } else {
            return name;
        }
    }

    private String adverb(String adverb) { //adverb
        if (adverb.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "shakily";
            } else if (random == 2) {
                return "sternly";
            } else {
                return "vigorously";
            }
        } else {
            return adverb;
        }
    }

    private String sillyWord(String sillyWord) { //silly word
        if (sillyWord.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "quackadiles";
            } else if (random == 2) {
                return "bazzingas";
            } else {
                return "bumfuzzle";
            }
        } else {
            return sillyWord;
        }
    }

    private String nounPlur(String nounPlur) { //plural noun
        if (nounPlur.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "burgers";
            } else if (random == 2) {
                return "wheels";
            } else {
                return "noses";
            }
        } else {
            return nounPlur;
        }
    }

    private String replace(String searchChar, String origStr, String replaceChar){
        String finalstr = "";
        int strlength = searchChar.length();
        for(int i = 0; i < origStr.length();i++){
            if (origStr.substring(i,i+strlength-1).equals(searchChar)){
                finalstr += replaceChar;
            } else {
                finalstr += origStr.substring(i,i+1);
            }
        }
        return finalstr;
    }
}