public class CheckSubsequence {
  public boolean isSubSeq(String s1, String s2) {
       if(s1.length()>s2.length()) return false;
       if(s1.length()==s2.length()) return s1.equals(s2);
       int i=0,j=0;
       while(i<s2.length() && j<s1.length()){
           if(s2.charAt(i)==s1.charAt(j)) j++;
           i++;
       } return j==s1.length();
    }
}
