import java.util.Arrays;

public class CountNumberOfPossibleTriangle {
  static int countTriangles(int arr[]) {
    int count=0,i,j,k;
    Arrays.sort(arr);
    for(i=0;i<arr.length-2;i++)
    {
        k=i+2;
        for(j=i+1;j<arr.length-1;j++)
        {
            if(j==k) k++;
            while(k<arr.length && arr[i]+arr[j]>arr[k])
            {
                k++;
            }
            count+=k-j-1;
        }
    }
    return count;
}
}
