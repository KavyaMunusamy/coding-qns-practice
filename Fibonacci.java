import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long num = fib(n);
        System.out.println("Fibonacci of " + n + " is : " + num);
    }
    private static long fib(int n){
        if(n<=2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
