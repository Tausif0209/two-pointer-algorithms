import java.util.Arrays;

public class Leetcode2410 {
  public int matchPlayersAndTrainers(int[] g, int[] s) {
        int total=0,i=0,j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                total++;
                i++;
                j++;
            }
            else j++;
        } return total;
    }
}
