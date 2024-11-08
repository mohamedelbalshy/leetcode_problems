import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        
    
    }

    public static int removeDuplicates(int[] nums) {
        HashMap<Integer, Boolean> map = new LinkedHashMap<>();
        
        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            if(!map.containsKey(current)){
                map.put(current, true);
            }
        }
        int i =0;
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            Integer key = entry.getKey();
            System.out.println(key);
                nums[i] = key;
                i++;

        }


        return map.size();
    }
    
}