package interview

import java.util.HashSet;

-easy;
class Solution {

    //brute force solution - time limit exceeded
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        for(int i =0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    flag=true;
                    break;
                }
            }
        }
        if(flag)
        return true;
        else
        return false;
    }

    //slightly better solution using Hash Table
    public boolean containsDuplicate(int[] nums) {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> h = new HashSet<Integer>(nums.length);
            for(int i : nums){
                if(h.contains(i)){ return true;}
                h.add(i);
            }
            return false;
}
    }