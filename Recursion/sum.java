package Recursion;

public class sum {
    static int naturalsum(int n){
        if (n<=1){
            return n;
        }
        return n + naturalsum(n-1);
    }
    public static void main(String args[]){
        int n = 7;
        System.out.print(naturalsum(n));
    }
    
}
