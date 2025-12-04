
import java.util.*;
public class sortedSquares1 {
    public static int[] sorted(int[] nums){
        int[] arr=new int[nums.length];

        //bubble sort appoach n x n
        for(int i=0; i<nums.length; i++){
            arr[i]=nums[i]*nums[i];
        }
        for(int i=0; i<nums.length-1; i++){
            boolean swapped=false;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;                
                }
            }
            if(!swapped) break;
        }
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
