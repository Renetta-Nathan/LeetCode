class Solution(object):
    def addBinary(self, a, b):
        sum=int(a,2)+int(b,2)
        binsum=bin(sum)
        return binsum[2:]
        