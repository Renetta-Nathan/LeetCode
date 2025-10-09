class Solution(object):
    def reverseBits(self, n):
        og=bin(n)[2:].zfill(32)
        rev=og[::-1]
        return int(rev,2)
