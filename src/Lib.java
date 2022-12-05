import java.util.Scanner;
public class Lib {
    private String Lib1 = "-----Welcome Class!-----\nHello everybody! W1 W2 here...."; //these will be the uncompleted text
    private String Lib2 = "-----Can I Have Your Daughter's Hand?-----Dear Mr. and Mrs. W1 W2,\n\nWill you let me marry your W3? Ever since I have laid eyes on W3, I have W4 madly in love with her. I wish that she will be the W5 of my W6 and that someday we will W7 happily ever after. I have a job as a/an W8 that pays $W9 each month. I promise to W10 W3 with kindness and respect.\n\nSincerely,\nW11 W12";
    private String Lib3 = "-----Wacky Star Wars-----\nDarth [Word Not Submitted] looked at his master while his [Word Not Submitted] breathing filled the room. He was told to go to [Word Not Submitted] evrything on the planet of [Word Not Submitted]. He got in his [Word Not Submitted] and jumped to hyperspace. Soon before he reached the planet, he dropped out of hyperspace and was attacked by Rebel [Word Not Submitted]. He [Word Not Submitted] them off and continued to the planet`s surface. He landed and confronted more opposition, slicing it down with his [Word Not Submitted]. He used the [Word Not Submitted] to choke another Rebel, then [Word Not Submitted] him aside. He finished off all life on the planet with a/an [Word Not Submitted] laugh.";
    private int choice;

    public Lib(){
        choice = 1;
    }
    public Lib(int choice){
        this.choice = choice;
    }
    public String replace(String searchChar, String origStr, String replaceChar){
        String finalstr = "";
        int strlength = searchChar.length();
        for(int i = 0; i < origStr.length();i++){
            if (origStr.substring(i,i+strlength).equals(searchChar)){
                finalstr += replaceChar;
            } else {
                finalstr += origStr.substring(i,i+1);
            }
        }
        return finalstr;
    }

    public String W1(String W1) { //adjective
        if (W1.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "immense";
            } else if (random == 2) {
                return "elated";
            } else {
                return "scruffy";
            }
        } else {
            return W1;
        }
    }
    public String W2(String W2) { //name
        if (W2.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "Bill Bungleberry";
            } else if (random == 2) {
                return "Ryan Smith";
            } else {
                return "Nathan Folwell";
            }
        } else {
            return W2;
        }
    }
    public String W3(String W3) { //noun
        if (W3.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "bookshelf";
            } else if (random == 2) {
                return "ink cartridge";
            } else {
                return "space ship";
            }
        } else {
            return W3;
        }
    }
    public String W4(String W4) { //past tense verb
        if (W4.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "fallen";
            } else if (random == 2) {
                return "painted";
            } else {
                return "programmed";
            }
        } else {
            return W4;
        }
    }
    public String W5(String W5) { //noun
        if (W5.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "bookshelf";
            } else if (random == 2) {
                return "ink cartridge";
            } else {
                return "space ship";
            }
        } else {
            return W5;
        }
    }
    public String W6(String W6) { //noun
        if (W6.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "bookshelf";
            } else if (random == 2) {
                return "ink cartridge";
            } else {
                return "space ship";
            }
        } else {
            return W6;
        }
    }
    public String W7(String W7) { //verb
        if (W7.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "live";
            } else if (random == 2) {
                return "laugh";
            } else {
                return "compute";
            }
        } else {
            return W7;
        }
    }
    public String W8(String W8) { //job
        if (W8.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "game dev";
            } else if (random == 2) {
                return "pencil sharpener";
            } else {
                return "roller coaster tester";
            }
        } else {
            return W8;
        }
    }
    public String W9(String W9) { //number
        if (W9.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "69420";
            } else if (random == 2) {
                return "87";
            } else {
                return "3.14159265359";
            }
        } else {
            return W9;
        }
    }
    public String W10(String W10) { //verb
        if (W10.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "laugh";
            } else if (random == 2) {
                return "live";
            } else {
                return "compute";
            }
        } else {
            return W10;
        }
    }
    public String W11(String W11) { //adjective
        if (W11.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "immense";
            } else if (random == 2) {
                return "ellated";
            } else {
                return "scruffy";
            }
        } else {
            return W11;
        }
    }
    public String W12(String W12) { //name
        if (W12.equals("random")) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                return "Billy Bobblehead";
            } else if (random == 2) {
                return "Katniss Everdeen";
            } else {
                return "Mat Wargacki";
            }
        } else {
            return W12;
        }
    }

    public void print(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an adjective");
        Lib1 = replace("W1",Lib1,W1(scan.nextLine()));


    }
}