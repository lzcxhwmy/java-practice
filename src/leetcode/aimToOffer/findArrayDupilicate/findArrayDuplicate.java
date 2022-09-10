package leetcode.aimToOffer.findArrayDupilicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class findArrayDuplicate {

}

class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num: nums){
            if (seen.contains(num)) return num;
            seen.add(num);
        }
        return -1;
    }
}