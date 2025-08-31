public class ContainerWithMostWater {
   public int maxArea(int[] height) {
        if(height.length==2) return Math.min(height[0],height[1]);
        int i=0,j=height.length-1,maxArea=Math.min(height[0],height[1]);
        while(i<j){
            if(height[i]<=height[j]){
                maxArea=Math.max(maxArea,height[i]*(j-i));
                i++;
            }
            else {
                maxArea=Math.max(maxArea,height[j]*(j-i));
                j--;
            }
        } return maxArea;
    }
}
