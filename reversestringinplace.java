import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        int l=0, r=n-1;
        while(l<r){
            char a = sb.charAt(l);
            sb.setCharAt(l,sb.charAt(r));
            sb.setCharAt(r,a);
            l++;
            r--;
        }
        System.out.println("Reversed string: " + sb.toString());
    }
}
