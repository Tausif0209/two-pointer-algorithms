public class TheCelebrityProblem {
   public int celebrity(int mat[][]) {
        //Brute Force:-O(N^2)
    //   if(mat.length==1) return 0;
    //   int ans=-1;
    //   for(int i=0;i<mat.length;i++){
    //       int sum=0;
    //       for(int j=0;j<mat.length;j++){
    //           sum+=mat[i][j];
    //       }
    //       if(sum==1) ans=(ans==-1)?i:-1;
    //   }
    //   if(ans==-1) return -1;
    //   for(int i=0;i<mat.length;i++){
    //       if(mat[i][ans]!=1)  return -1;
    //   } return ans;
    
    //O(n)
    if(mat.length==1) return 0;
    int start=0,end=mat.length-1;
    while(start<end){
        if(mat[start][end]==1) start++;
        else end--;
    }
    for(int i=0;i<mat.length;i++){
        if(i==start) continue;
        if(mat[i][start]==0 || mat[start][i]==1) return -1;
    }
     return start;
    } 
}
