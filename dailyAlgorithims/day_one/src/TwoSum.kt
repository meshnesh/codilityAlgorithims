import java.util.*
import kotlin.collections.HashSet

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//Example:
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

fun main(args: Array<String>) {
    val s = intArrayOf(10, 20, 30, 50, 80)
    val p = 110

    print("${twoSum(s, p)}")
}

fun twoSum(nums: IntArray, target: Int): IntArray {

    //brute force this takes O(n2)

//    for (i in nums.indices){
//        var j = i + 1
//        for ( j in nums.indices)
//        if (nums[i] + nums[j] == target) {
//            return true
//        }
//    }


//    a hash table this takes O(n)
//
//    var vales = HashSet<Int>()
//
//    for (i in nums.indices) {
//        if (vales.contains(target - nums[i])) return true
//        vales.add(nums[i])
//    }

    //Sorting and Binary Search this takes O(n log n)

//    Arrays.sort(nums)
//    for (i in nums.indices) {
//        val siblingIndex = Arrays.binarySearch(nums, target - nums[i])
//        if (siblingIndex >= 0) {
//            /* If this points at us, then the pair exists only if
//            * there is another copy of the element. Look ahead of
//            * us and behind us.
//            */
//
//            if (siblingIndex != i || (i > 0 && nums[i - 1] == nums[i]) || (i < nums.size - 1 && nums[i + 1] == nums[i])) return intArrayOf(nums[i], nums[i + 1])
//        }
//    }

//Sorting and Walking Inward this takes O(n log n)
    Arrays.sort(nums)
    var lhs = 0
    var rhs = nums.size - 1
    while (lhs < rhs) {
        var sum = nums[lhs] + nums[rhs]
        if (sum == target) return intArrayOf(lhs, rhs)
        else if (sum < target) lhs++
        else rhs--
    }


    return intArrayOf()

}
