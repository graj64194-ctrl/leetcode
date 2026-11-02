
class Solution {
    public int minMoves2(int[] nums) {
        long min=Long.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            long diff=0;
            long sum=0;
            for (int j=0;j<nums.length;j++){
                diff=nums[i]-nums[j];
              
                sum+=Math.abs(diff);
                
            }
            min=Math.min(min,sum);
        }
        return (int)min;
    }
}