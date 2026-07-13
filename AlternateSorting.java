import java.util.*;

class AlternateSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];//7 5 4 6 2 1 3
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] res = new int[n];
        int l=0, r=n-1;
        int ind = 0;
        Arrays.sort(arr);//1 2 3 4 5 6 7
        while(l<=r){
            if(ind%2==0){
                res[ind] = arr[r];
                ind++;
                r--;
            }else{
                res[ind] = arr[l];
                ind++;
                l++;
            }
        }
        System.out.println("Alternate Sorted Array: ");
        for(int num : res){
            System.out.print(num + " ");//7 1 6 2 5 3 4
        }
    }
}
