package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2+string1;
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        String s = "";
        for(int i = 0;i<string.length();i++){
            s+=" ";
        }
        return s;
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        String s = "";
        for(int i=0;i<string.length();i++){
            if(Character.isUpperCase(string.charAt(i))){
                s+=Character.toLowerCase(string.charAt(i));
            }else if(Character.isLowerCase(string.charAt(i))){
                s+=Character.toUpperCase(string.charAt(i));
            }else{
                s+=string.charAt(i);
            }
        }
        return s;
    }

    public String oneAtATime(String string1, String string2) {
        if(string1.length()==0&&string2.length()==0){
            return "";
        }
        int i =0;
        int j=0;
        String s = "";
        while(i<string1.length()||j<string2.length()){
            s+=i<string1.length()?string1.charAt(i):"";
            s+=j<string2.length()?string2.charAt(j):"";
            i++;
            j++;
        }
        return s;
    }
}
