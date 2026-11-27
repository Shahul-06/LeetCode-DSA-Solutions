class Solution {
    public int numSquares(int n) {
      int dp[]= new int [n+1];
         Arrays.fill(dp,n+1);
         dp[0]=0;
         for(int num=1;num*num<=n;num++){
            int srq=num*num;
            for(int j=srq;j<=n;j++){
                dp[j]=Math.min(dp[j],1+dp[j-srq]);
            }
         }
         return dp[n];
    }
}