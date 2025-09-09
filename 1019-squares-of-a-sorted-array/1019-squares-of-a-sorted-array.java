class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int resultIndex = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[resultIndex] = leftSquare;
                left++;
            } else {
                result[resultIndex] = rightSquare;
                right--;
            }
            resultIndex--;
        }
        return result;
    }
}