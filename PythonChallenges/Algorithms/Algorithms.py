# Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
# Input: [-2,1,-3,4,-1,2,1,-5,4],
# Output: 6
# Explanation: [4,-1,2,1] has the largest sum = 6.


def max_sub_array(nums):
    if len(nums) == 1:
        return nums[0]

    total = nums[0]
    best = nums[0]

    for i in nums[1:]:
        if i > (total + i):
            total = i
        else:
            total += i

        best = max(best, total)

    return best
