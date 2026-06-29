class Solution {
    public int countDigits(int num) {
        int a=num;
        int count=0;
        while (a>0){
            int temp=a%10;
            if (num%temp==0) count++;
            a=a/10;
        }
        return count;
    }

}