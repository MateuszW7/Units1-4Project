



//Disclaimer: i am very far from finishing my final project,
// so if u want more info look at the doc




public class Lib {
    private String word;
    private String W1,W2,W3,W4,W5,W6,W7,W8,W9,W10,W11,W12;
    private String Lib1 = "-----Welcome Class!-----\nHello everybody! W1 W2 here...."; //these will be the uncompleted text
    private String Lib2 = "";
    private String Lib3 = "";
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

    public void setName(){

    }


    public void print(){
        String temp;
        if(choice==3){
            temp = Lib3;
        } else if (choice==2) {
            temp = Lib2;
        }else{
            temp = Lib1;
        }
        temp = replace(name,temp,name);

    }
}