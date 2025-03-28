package Recursion;

public class subsetstring {
    static void sub(String str, int i, String curr){
        if (i == str.length()){
            System.out.println(curr);
            
            return;
        }
        sub(str,i+1,curr + str.charAt(i));
        sub(str,i+1,curr);

    }
    public static void main(String[] args){
        String str = "wish";
        int i = 0;
        String curr = "";
        sub(str,i,curr);

    }
}
