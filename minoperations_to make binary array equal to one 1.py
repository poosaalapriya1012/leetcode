def minOperations(nums):
       k=3
       count=0
       for i in range(len(nums)-k+1):
        if nums[i]==0:
            nums[i]^=1
            nums[i+1]^=1
            nums[i+2]^=1
            count+=1
       if 0 not in nums:
        return count
       return -1
    
nums=[0,1,1,1,0,0]
print(minOperations(nums))

        