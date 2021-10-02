class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long sum=arr[0];
    long dp[]=new long[n];
        dp[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            dp[i]=max(dp[i-1],0)+arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
        sum=max(dp[i],sum);
        
        }
      //  System.out.print(sum);
        return sum;
    }
    long max(long a,long b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    
}

