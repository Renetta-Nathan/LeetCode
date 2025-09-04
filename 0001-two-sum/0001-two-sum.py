class Solution(object):
    def twoSum(self, nums, target):
        ans=[]
        for i in range(len(nums)):
            for j in range(i,len(nums)):
                if i==j:
                    continue
                elif nums[i]+nums[j]==target:
                    ans.append(i)
                    ans.append(j)
        return ans



        