class Solution {
    // brute force solution using extra space . very bad results
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        int temp,prev;
        
        for(int i =0;i<k;i++){
            prev = nums[nums.length-1];
            for(int j=0;j<nums.length;j++){
                temp = nums[j];
                nums[j] = prev;
                prev = temp;
            }
            
        }

    }


    //efficient solution using reverse:  
    //rotating the array k times, means k elements from the back end of the array come to the front
    // and k elements from the beginning come to the start.
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public void reverse(int[] nums,int start, int end ){
        while(start<end){
            int temp;
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }



}