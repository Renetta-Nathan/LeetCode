class Solution 
{
    public int maximumWealth(int[][] accounts) 
    {
        int max=Sum(accounts[0]);
        for(int i=0;i<accounts.length;i++)
        {
            if(Sum(accounts[i])>max)
            max=Sum(accounts[i]);
        }
        return max;
    }

    public int Sum(int[] arr)
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans+=arr[i];
        }
        return ans;
    }
}