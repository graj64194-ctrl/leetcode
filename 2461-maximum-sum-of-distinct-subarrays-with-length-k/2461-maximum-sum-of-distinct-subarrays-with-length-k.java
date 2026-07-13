class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        int i=0;
        int j=0;
        int count=0;
        long max=0;
        long sum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (j<arr.length){
            sum+=arr[j];
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            if (j-i+1<k) j++;
            else if (j-i+1==k){
                if (map.size()==k) max=Math.max(sum,max);
                map.put(arr[i],map.get(arr[i])-1);
                if (map.get(arr[i])==0){
                    map.remove(arr[i]);
                }
                sum-=arr[i];
               j++;
               i++;
            }
        }  
        return max;
    }
}