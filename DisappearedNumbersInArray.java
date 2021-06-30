import java.util.*;

// Time Complexity : O(n)
// Space Complexity : LO(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class DisappearedNumbersInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        if(nums == null || nums.length == 0){
            return result;
        }
        
        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0){
                nums[index] *= -1;
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                nums[i] *= -1;
            }
            else{
                result.add(i+1);
            }
        }
        
        return result;
    }
}