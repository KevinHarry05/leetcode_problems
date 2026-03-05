class Solution {
    public long findnextp(long num){
        long l=num+1, r= Long.MAX_VALUE;
        long res=0;
        while(l<=r){
            long mid=l+(r-l)/2;
            long currp=converttop(mid);
            if(currp>num){
                res=currp;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }

    public long findprevp(long num){
        long l=0,r=num-1;
        long res=0;
        while(l<=r){
            long mid=l+(r-l)/2;
            long currp=converttop(mid);
            if(currp<num){
                res=currp;
                l=mid+1;
            }
            else{
                r=mid-1;
            }

        }
        return res;
    }

    public long converttop(long num){
        String str=String.valueOf(num);
        int n=str.length();
        int div=n/2;
        char[]ch=str.toCharArray();
        for(int i=0;i<div;i++){
            ch[n-1-i]=ch[i];
        }
        return Long.parseLong(new String(ch));
    }

    public String nearestPalindromic(String n) {
        long num=Long.parseLong(n);
        long nextp=findnextp(num);
        long prevp=findprevp(num);
        if(Math.abs(prevp-num)<=Math.abs(nextp-num)){
            return String.valueOf(prevp);
        }
        return String.valueOf(nextp);
    }
}