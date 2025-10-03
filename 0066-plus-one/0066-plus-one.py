class Solution(object):
    def plusOne(self, digits):
        combined="".join([str(num) for num in digits])
        n=int(combined)
        n=n+1
        final=[int(digit) for digit in str(n)]
        return final

        