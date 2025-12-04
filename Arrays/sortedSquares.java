
import java.util.*;
public class sortedSquares {
    public static int[] sorted(int[] nums){
        int[] arr=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i]=nums[i]*nums[i];
        }
        // arraysort algorithm o(nlogn)
        Arrays.sort(arr);
        return arr;
    } 

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int[] res=sorted(arr);
        System.out.println(Arrays.toString(res));
        sc.close();
    }
}
