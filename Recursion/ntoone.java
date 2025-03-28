package Recursion;

public class ntoone {
    static void reverseprint(int n){
        if (n<=0){
            return;
        }
        else{
            System.out.print(n + " ");
            reverseprint(n-1);
        }
    }
    public static void main(String[] args){
        int n = 10;
        reverseprint(n);
    }
}
