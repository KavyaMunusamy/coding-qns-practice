import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long num = fact(n);
        System.out.println("Factorial of " + n + " is : " + num);
    }
    private static long fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
