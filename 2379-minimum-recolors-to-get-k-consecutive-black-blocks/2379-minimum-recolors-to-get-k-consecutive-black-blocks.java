class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int i=0;
        int j=0;
        int white=0;
        int black=0;
        int max=0;
        int min=k;
        while (j<n){
            char ch = blocks.charAt(j);
            if (ch=='W') white++;
            if (j-i+1<k) j++;
            else if (j-i+1==k) {
                min=Math.min(white,min);
                if (blocks.charAt(i)=='W') white--;
                i++;
                j++;
            }

        }
        return min;
    }
}