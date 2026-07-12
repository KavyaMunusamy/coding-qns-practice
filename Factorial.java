import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = fact(n);
        System.out.println("Factorial of " + n + " is : " + num);
    }
    private static int fact(int n){
        if(n<=2){
            return n;
        }
        return n*fact(n-1);
    }
}
