import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "aababcabc";
        String pattern = "abc";
        List<Integer> li = new ArrayList<>();
        helper(text,pattern,li);
        for(int i=0; i<li.size(); i++){
            System.out.print(li.get(i) + " ");// 3 6
        }
    }
    private static void helper(String text,String pattern,List<Integer> li){
        for(int i=0; i<=text.length()-pattern.length(); i++){
            boolean match = true;
            for(int j=0; j<pattern.length(); j++){
                if(text.charAt(i+j) != pattern.charAt(j)){
                    match = false;
                    break;
                }
            }
            if(match){
                li.add(i);
            }
        }
    }
}
