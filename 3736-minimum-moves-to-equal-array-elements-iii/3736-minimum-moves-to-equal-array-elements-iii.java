class Solution {
    public int minMoves(int[] nums) {
         long min=0;
         int n=nums.length;
         Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
          min+=nums[n-1]-nums[i];
        }
        return (int)min;
    }
}