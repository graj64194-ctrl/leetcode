class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
          HashSet<Integer> a = new HashSet<>();
          int n=nums.length;
          int i=0;
          int j=0;
          while (j<n){
            if (a.contains(nums[j])) return true;
            a.add(nums[j]);
            if (a.size()>k){
                a.remove(nums[i]);
                i++;
            }
            j++;
          }
          
       return false;

    }
}