public class Lib {
    private String name,noun1,noun2,noun3,noun4,adjective1,adjective2,adjective3,adjective4,adjective5,adjective6,verb1,verb2,verb3,verb4,adverb1,adverb2;
    private String Lib1 = "";
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