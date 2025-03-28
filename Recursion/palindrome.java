package Recursion;

public class palindrome {
    static boolean palindromestring(String str,int s, int e){
        if (s>=e){
            return true;
        }
        palindromestring(str,s+1,e-1);
        return(str.charAt(s)==str.charAt(e));

    }
    public static void main(String[] args){
        String str = "malayalams";
        int e = str.length();
        System.out.print(palindromestring(str,0,e-1));

    }
    
}
