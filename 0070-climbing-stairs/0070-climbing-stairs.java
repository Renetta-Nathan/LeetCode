class Solution 
{
    public int climbStairs(int n) 
    {
        if(n==1)
        return 1;
        int one=2;
        int two=1;
        for(int i=3;i<=n;i++)
        {
            int curr=one+two;
            two=one;
            one=curr;
        }
        return one;
    }
}