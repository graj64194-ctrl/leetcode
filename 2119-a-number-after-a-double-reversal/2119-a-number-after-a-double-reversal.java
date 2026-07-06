class Solution {
    public boolean isSameAfterReversals(int num) {
        int y=num;
        int reverse=0;
        int reverse2=0;
        if (num<0) return false;
        while (num>0){
            int temp=num%10;
            reverse =(reverse*10) + temp;
            num/=10;
        }
        while (reverse>0){
            int temp=reverse%10;
            reverse2 =(reverse2*10) + temp;
            reverse/=10;
        }

        if (y==reverse2 || y==0) return true;
        else return false;
    }
}