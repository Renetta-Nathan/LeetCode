class Solution {
    public int lengthOfLastWord(String s) 
    {
        s=s.trim();
        int ctr=0;
        int l=s.lastIndexOf(" ");
        for(int i=l+1;i<s.length();i++)
        {
            ctr++;
        }
        return ctr;
    }
}