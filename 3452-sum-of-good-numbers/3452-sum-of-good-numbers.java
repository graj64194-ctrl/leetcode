class Solution {
    public int sumOfGoodNumbers(int[] num, int k) {
        int n=num.length;
        int sum=0;
        for (int i=0;i<n;i++){
            if(((i-k)<0) && (num[i]>num[i+k])) sum+=num[i];
            
            else if (((i+k)>=n) && (num[i]>num[i-k])) sum+=num[i];
            
            else if (((i-k)>=0 && (i+k)<n) && (num[i]>num[i-k]) && (num[i]>num[i+k])) sum+=num[i];
            else if ((i+k)>=n && (i-k)<0) sum+=num[i];
            
            
        }
        return sum;
    }
}