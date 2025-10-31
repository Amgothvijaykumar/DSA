package Arrays;
import java.util.*;
public class sortedSquares2p {
    public static int[] sorted(int[] nums){
        int n=nums.length;
        int[] res=new int[n];
        int left=0;
        int right=n-1;
        int pos=n-1;
// two pointers approach o(n)
        while(left<=right){
            int leftsqr=nums[left]*nums[left];
            int rightsqr=nums[right]*nums[right];

            if(leftsqr>rightsqr){
                res[pos]=leftsqr;
                left++;
            }else{
                res[pos]=rightsqr;
                right--;
            }
            pos--;
        }
        return res;
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
