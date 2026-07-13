class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int i=0;
        int j=0;
        int count=0;
        int max=0;
        while (j<n){
            char ch= s.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;
            if (j-i+1<k) j++;
            else if (j-i+1==k){
                char c =s.charAt(i);
                 max=Math.max(max,count);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count--;
               j++;
               i++;
            }
        }
        return max;
    }
}