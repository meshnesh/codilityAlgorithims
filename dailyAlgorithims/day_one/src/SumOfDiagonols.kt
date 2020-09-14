//import kotlin.math.abs
//
//
//fun main(args: Array<String>) {
//
//    val mat = arrayOf(
//
//        intArrayOf(11, 2, 4),
//        intArrayOf(4, 5, 6),
//        intArrayOf(10, 8, -12)
//
//    )
//
////    println("${indexOf(53, 1953786)}")
//}
//
//
//fun sumOfDiagonals(arr: Array<IntArray>): Int {
//
//    var leftToRight = 0
//    var rightToLeft = 0
//    val rows = arr.size
//    val columns = arr[0].size
//
//    var i = 0
//    var j = 0
//    var k = 0
//    var l = arr.size - 1 //right to left column counter
//
//    while (rows >= 0 && columns >= 0 && rows >= 0 && l >= 0) {
//
//        leftToRight += arr[i][j] //add the values at the position
//        rightToLeft += arr[k][l] //add the values at the position
//
//        i += 1
//        j += 1
//        k += 1
//        l -= 1
//
//    }
//
//    return abs(leftToRight - rightToLeft) ///return the total subscription of the values of left nad right
//
//}
////
////fun numDigits(number: Int): Int {
////    var number = number
////    run {
////        var counter = 0
////        while (number > 0) {
////            number = number / 10
////            counter++
////        }
////        return counter
////    }
////}
////
////
////fun indexOf(number: Int, digit: Int): Int {
////    val count: Int = numDigits(number)
////    for (i in 1..count) {
////        if (digit == getDigit(number.toChar(), i.toChar())) return i
////    }
////    return -1 //the digit was not found
////}
//
//// Java program to print initials of a name
////internal object GFG {
////    // Function to find the number of occurrences
////    // of a character at position P upto p-1
////    fun Occurrence(s: Int, position: Int): Int {
////        var count = 0
////        for (i in 0 until position - 1) if (s.toString()[i] == s.toString()[position - 1]) count++
////
////        // Return the required count
////        return count
////    }
////
////    // Driver code
////    @JvmStatic
////    fun main(args: Array<String>) {
////        val s = 1953786
////        val p = 53
////
////        // Function call
////        println(Occurrence(s, p))
////    }
////}
//
//fun Occurrence(s: Int, position: Int): Int {
//    val number = s.toString()
//    return number.indexOf(position.toString())
//}
//
//
//fun main(args: Array<String>){
//    val values = listOf(
//        Pair(195378, 53),
//        Pair(195378678, 78),
//        Pair(195378678, 57)
//    ).map { Occurrence(it.first, it.second) }
//    println(values)
//}