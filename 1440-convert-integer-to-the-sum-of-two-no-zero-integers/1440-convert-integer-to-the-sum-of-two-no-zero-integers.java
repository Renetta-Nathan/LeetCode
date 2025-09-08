class Solution 
{
    public int[] getNoZeroIntegers(int n) 
    {
        int ans[]=new int[2];
        for (int i=1;i<n;i++) 
        {
            int j= n - i;
            if (isNoZero(i) && isNoZero(j)) 
            {
                ans[0]=i;
                ans[1]=j;
                return ans;
            }
        }
        return ans;
    }

    private boolean isNoZero(int k) {
        String s = String.valueOf(k);
        return !s.contains("0");
    }
}