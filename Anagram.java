import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.length() != s2.length()){
            System.out.println("Not a Anagram");
            return;
        }
        int[] freq = new int[26];
        for(char c : s1.toCharArray()){
            freq[c-'a']++;
        }
        for(char c : s2.toCharArray()){
            freq[c-'a']--;
        }
        for(int num : freq){
            if(num != 0){
                System.out.println("Not a Anagram");
                return;
            }
        }
        System.out.println("It is a Anagram");
