import java.util.*;

class ContiguousSubsequence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> res = subsequence(arr);
        for(List<Integer> li : res){
            System.out.println(li);
        }
    }
    private static List<List<Integer>> subsequence(int[] arr){
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] < arr[j]){
                    List<Integer> cur = new ArrayList<>();
                    for(int k=i; k<=j; k++){
                        cur.add(arr[k]);
                    }
                    res.add(cur);
                }else{
                    break;
                }
            }
        }
        return res;
    }
  
}
/*
output:
[4, 6]
[4, 6, 7]
[4, 6, 7, 7]
[6, 7]
[6, 7, 7]
*/



