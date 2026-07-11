import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();//2 -3 4 -1 2
        }
        System.out.println("Original Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int sum = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            sum = Math.max(arr[i],sum+arr[i]);
            max = Math.max(max,sum);
        }
        System.out.println("Maximum sum : " + max);//5
    }
}
