package GreedyAlgo;
import java.util.*;
public class DeliveryBoy {

    static int MaxDelivery(int[] items, int[] room){
        int count=0;
        
        int n=room.length;
        int[] effective=new int[n];
        effective[0]=room[0];
        for (int i=1; i<n; i++){
            effective[i]=Math.min(effective[i-1],room[i]);
        }
        //sorting items
        Arrays.sort(items);

        int i=items.length-1;
        int j=0;

        while(i>=0 && j<=n){
            if(items[i]<=effective[j]){
                count++;
                i--;
                j++;
            }else{
                i--;
            }
            
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] items=new int[n];
        for(int i=0;i<n;i++) items[i]=sc.nextInt();
        int[] room=new int[m];
        for(int i=0;i<m;i++) room[i]=sc.nextInt();
        System.out.println(MaxDelivery(items,room));
        sc.close();

    } 
    
}
