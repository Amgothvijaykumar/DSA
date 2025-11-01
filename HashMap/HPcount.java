package HashMap;
import java.util.*;
public class HPcount {
    public static void main(String[] args){
        int[] arr={1,2,1,3,2,2};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }

        for(int i:hm.keySet()){
            System.out.println(i+" "+hm.get(i));
        }
    }
}

/* alternate way
 for (int num : arr) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}

 */