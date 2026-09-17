class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count =0;
        int l=0;
       for (int i=0;i<arr.length;i++){
            int j=arr[i]-(i+1);
            if (j>=k){
                return k+i;
            } 

           
        
        }
        
       
       return k+arr.length;
    }
}