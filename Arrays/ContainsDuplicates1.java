
import java.util.*;
public class ContainsDuplicates1 {
    static boolean Duplicates(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,1,7,8,9,0};
        System.out.println(Duplicates(nums));
    }
}
