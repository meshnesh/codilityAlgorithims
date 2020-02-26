fun main(args: Array<String>) {

    val x = intArrayOf(1,2,3,4)
    val y = intArrayOf(50,0,10,2)
    val res = 42

    print("${sumOfTwo(x, y, res)}")
}

//fun sumOfTwo(a: IntArray, b: IntArray, v: Int): Boolean {
//    // brute force
//    // Big O(Nsqd)
//    for (i in a.indices) {
//        var needed_value: Int = v - a[i]
//
//        for (j in b.indices) {
//            if (b[j] == needed_value) return true
//        }
//    }
//    return false
//}

fun sumOfTwo(a: IntArray, b: IntArray, v: Int): Boolean {
    // Big O(N) only compromises the memory
    val differences = HashSet<Int>()
    for (i in a.indices) {
        val difference = v - a[i] // checks the required number required to meet the requirement
        differences.add(difference) // adds it to the hashset
    }

    for (i in b.indices) {
        if (differences.contains(b[i])) return true // checks if the number in the hash set is in the second array
    }

    return false
}
