package HashMap;
import java.util.*;
public class HP {
    public static void main(String[] args){
        int[] arr={6,4,3};
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            hm.put(arr[i],arr[i]*arr[i]);
        }

        System.out.println(hm.get(6));
    }
}
