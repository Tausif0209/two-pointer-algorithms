import java.util.Arrays;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n=nums.length;
        if(n==1) return 0;
        long x=0,total=((1L*n*n)-n)/2;
        Arrays.sort(nums);
        int i=0,j=n-1;
        while(i<j){
            if(nums[i]+nums[j]>=lower) j--;
            else {
                x+=(j-i);
                i++;
            }
        }
        i=0;j=n-1;
        while(i<j){
            if(nums[i]+nums[j]<=upper) i++;
            else {
                x+=(j-i);
                j--;
            }
        }
        return total-x;
    }
}