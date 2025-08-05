package leetcode.Med;

import java.util.*;

public class _3Sum {
        public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new LinkedHashSet<>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    set.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        List<List<Integer>> answer = new ArrayList<>(set);
        return answer;
    }
}
