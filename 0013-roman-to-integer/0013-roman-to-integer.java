class Solution {
    public int rel(char c)
    {
        int num=0;
        switch(c)
        {
            case 'M':num=1000;break;
            case 'D':num=500;break;
            case 'C':num=100;break;
            case 'L':num=50;break;
            case 'X':num=10;break;
            case 'V':num=5;break;
            case 'I':num=1;break;
            default:num=0;break;
        }
        return num;
    }
    public int romanToInt(String s) 
    {
        int ans=0;
        char c;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            int curr=rel(s.charAt(i));
            if(curr<prev)
            ans-=curr;
            else
            ans+=curr;
            prev=curr;
        }
        return ans;
    }
}