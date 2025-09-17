public class TwoSum {
   public int[] twoSum(int[] nums, int target) {
        if(nums.length==2) return new int[]{1,2};
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==target) break;
            else if(nums[i]+nums[j]>target) j--;
            else i++;
        } return new int []{i+1,j+1};
    }
}
