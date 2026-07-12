import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l=0, r=s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                System.out.println("Not a Palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.println("It is a Palindrome");
    }
}
