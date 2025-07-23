public class RemoveElement {
  public int removeElement(int[] nums, int val) {
    if(nums.length==1) return nums[0]==val?0:1;
    int count=0;
    for(int el:nums){
        if(el!=val) count++;
    } 
    if(count==nums.length) return nums.length;
    int i=0,j=nums.length-1;
    while(i<count){
        if(nums[i]!=val) i++;
        else{
            while(nums[j]==val) j--;
            swap(i,j,nums);
        }
    }
    return count;
    }
    private void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
