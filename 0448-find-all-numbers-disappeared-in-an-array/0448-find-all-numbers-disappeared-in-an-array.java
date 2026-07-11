import java.util.HashSet;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        int n=nums.length;
        
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for (int i=1;i<=n;i++){
            if (!set.contains(i)){
                a.add(i);
            }
        }
        return a;
    }
}