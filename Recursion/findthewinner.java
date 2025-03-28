package Recursion;

public class findthewinner {
    static int survivor(int n, int k){
        if(n==1){
            return 1;
        }
        return (survivor(n-1,k)+k-1)%n+1;
    }
    public static void main(String[] args){
        int n  = 5;
        int k = 3;
        System.out.print(survivor(n,k));
    }    
}
