fun main(args: Array<String>) {

    val s = intArrayOf(-2,2,5,-11,6)

    print("${ArrayMaxConsecutiveSum(s)}")
}

// Given an array of integers, find the maximum possible sum you can get from on of its contiguous subarrays. The subarray from which this sum comes must contain at least `1` element
//Kadane's Algorithm

// nested for loop of 0(Nsqd)

fun ArrayMaxConsecutiveSum (inputArray: IntArray): Int {

    var max_sum = inputArray[0]
    var current_sum = max_sum

    for (i in inputArray.indices) {
        current_sum = (inputArray[i] + current_sum).coerceAtLeast(inputArray[i]) // checks what is greater the current_sum plus the  next element input position or the next element input position alone
        max_sum = current_sum.coerceAtLeast(max_sum) // we update the max sum with the current sum if it's greater
    }

    return max_sum
}
