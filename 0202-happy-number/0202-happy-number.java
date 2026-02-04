class Solution {
    public boolean isHappy(int n) {
        if (n == 1 || n == 7) return true;
        if (n < 10) return false; 
        int temp=n;
        int sum=0;
        while(temp>0)
        {
            int d=temp%10;
            sum=sum+(d*d);
            temp=temp/10;
        }
        return isHappy(sum);
        
    }
}