

    fun main(args: Array<String>) {
        val arr = intArrayOf(0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15)
        val n = arr.size
        println("Length of lis is " + lis(arr, n) + "\n")
    }

    /* lis() returns the length of the longest increasing
       subsequence in arr[] of size n */
    fun lis(arr: IntArray, n: Int): Int {
        val lis = IntArray(n)
        var j: Int
        var max = 0
        /* Initialize LIS values for all indexes */
        var i: Int = 0
        while (i < n) {
            lis[i] = 1
            i++
        }
        /* Compute optimized LIS values in bottom up manner */
        i = 1
        while (i < n) {
            j = 0
            while (j < i) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) lis[i] = lis[j] + 1
                j++
            }
            i++
        }
        /* Pick maximum of all LIS values */
        i = 0
        while (i < n) {
            if (max < lis[i]) max = lis[i]
            i++
        }
        return max
    }
