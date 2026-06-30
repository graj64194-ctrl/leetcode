class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if (k==0) return;
        int[] ans=new int[n];

        System.arraycopy(nums,n-k,ans,0,k);
        System.arraycopy(nums,0,ans,k,n-k);
        System.arraycopy(ans,0,nums,0,n);
        }
        
    
    }
