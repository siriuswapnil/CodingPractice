class binarysearch {

       int search(int[] nums, int target) {
            int low = 0, high = nums.length-1;
            while(low<=high){
               int mid = low + (high-low)/2;
                if(target == nums[mid]){
                    return mid;
                }
                else if(target>nums[mid]){
                    low = mid+1;
                }
                else{
                    high = mid -1;
                }
            }
            return -1;
       }
    int rec_bin(int arr[],int target,int low,int high){
        

    }
    public static void main(String[] args) {
        binarysearch ob = new binarysearch();
        int arr[] = {1,2,3,4,5};
        int target = 5;
        int result = ob.search(arr, target);
        System.out.println(result);
    }

}