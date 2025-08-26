package leetcode.Med;

import java.util.*;

public class _4Sum {
        List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> priorList = new ArrayList<>();
        kSum(4, 0, priorList, nums, (long)target);
        return list;
    }

    public void kSum(int k, int start, List<Integer> priorList, int[] nums, long target){
        if (k != 2) {
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i - 1]) continue;
                
                priorList.add(nums[i]);
                kSum(k - 1, i + 1, priorList, nums, target - nums[i]);
                priorList.remove(priorList.size() - 1);
            }
        } else { 
            int l = start;
            int r = nums.length - 1;

            while (l < r) {
                long currentSum = (long) nums[l] + (long) nums[r];
                if (currentSum < target) {
                    l++;
                } else if (currentSum > target) {
                    r--;
                } else {
                    List<Integer> newList = new ArrayList<>(priorList);
                    newList.add(nums[l]);
                    newList.add(nums[r]);
                    list.add(newList);
                    
                    l++;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    r--;
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                }
            }
        }
    }
}
