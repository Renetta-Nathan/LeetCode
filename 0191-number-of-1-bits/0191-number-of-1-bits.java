class Solution 
{
    public int hammingWeight(int n) 
    {
        int ctr=0;
        String bin=Integer.toBinaryString(n);
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)=='1')
            ctr++;
        }
        return ctr;
    }
}