import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//5
        int k = sc.nextInt();//2
        int[] arr = new int[n];//1 2 3 4 5
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Left rotated array: ");
        int cnt = 0;
        while(k != cnt){
            int temp = arr[0];
            for(int i=0; i<n-1; i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = temp;
            cnt++;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");//3 4 5 1 2
        }
        System.out.println();
        cnt = 0;
        System.out.println("Right rotated array:");
        while(cnt != k){
            int temp = arr[n-1];
            for(int i=n-1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            cnt++;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");//4 5 1 2 3
        }
    }
}
