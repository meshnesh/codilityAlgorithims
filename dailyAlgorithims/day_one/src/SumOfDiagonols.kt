import kotlin.math.abs

fun main(args: Array<String>) {

    val mat = arrayOf(

        intArrayOf(11, 2, 4),
        intArrayOf(4, 5, 6),
        intArrayOf(10, 8, -12)

    )

    println("${sumOfDiagonals(mat)}")
}


fun sumOfDiagonals(arr: Array<IntArray>): Int {

    var leftToRight = 0
    var rightToLeft = 0
    val rows = arr.size
    val columns = arr[0].size

    var i = 0
    var j = 0
    var k = 0
    var l = arr.size - 1 //right to left column counter

    while (rows >= 0 && columns >= 0 && rows >+ 0 && l >= 0) {

        leftToRight += arr[i][j] //add the values at the position
        rightToLeft += arr[k][l] //add the values at the position

        i += 1
        j += 1
        k += 1
        l -= 1

    }

    return abs(leftToRight - rightToLeft) ///return the total subscription of the values of left nad right

}
