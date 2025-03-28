package Recursion;

public class digitsum {
    static int sumofdigits(int n){
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum +=rem;
            n = n/10;
        }
        return sum;
    }
    static int recurdigitsum(int n){
        if (n == 0){
            return 0; 
        }
        return(n%10+recurdigitsum(n/10));

    }
    public static void main(String[] args){
        int n = -347;
        System.out.println(sumofdigits(n));
        System.out.println(recurdigitsum(n));
    }
    
}
