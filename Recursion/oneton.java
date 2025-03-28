package Recursion;

public class oneton {
    static void serialprint(int i,int n){
        if (i>n){
            return;
        }
        else{
            System.out.print(i + " ");
            serialprint(i+1,n);
        }
        
    }
    public static void main(String[] args){
        int n = 10;
        serialprint(1,n);
    }
}
