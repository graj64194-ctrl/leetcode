class Solution {
    public int minMoves(int[] nums) {
         long min=0;
         int n=nums.length;
         int max = 0;
         for (int i=0;i<n;i++){
            if (max<nums[i]) max=nums[i];
         }
        for (int i=0;i<nums.length;i++){
          min+=max-nums[i];
        }
        return (int)min;
    }
}