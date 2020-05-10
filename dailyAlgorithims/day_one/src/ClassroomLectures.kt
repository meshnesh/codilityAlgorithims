import java.util.*


fun main(args: Array<String>) {

    var s:Array<IntArray>? = null
    s = arrayOf(intArrayOf(30,75), intArrayOf(0, 50), intArrayOf(60, 150))

    println(s.size)

    println("${classroomLectures(s)}")
}

//{[[30, 75], [0, 50], [60, 150]}

fun classroomLectures(intervals: Array<IntArray>?): Int {
    val res: MutableList<IntArray> = ArrayList()
    if (intervals!!.isEmpty()) return res.size //TypedArray in kotlin brings back the original array containing all of the elements of this collection

    // sorting array in ascending order of start time
    Arrays.sort(intervals) { a: IntArray, b: IntArray -> a[0] - b[0] }

    var start = intervals[0][0]
    var end = intervals[0][1]

    // first interval will always there in answer, so starting from i = 1
    for (i in intervals) {

        if (i[0] <= end) {

            // if last merged interval's end is smaller than start of current interval
            // this is a new interval, increase index & put this interval
            end = Math.max(end, i[1])

        } else {

            // else if last merged interval's end is smaller than end of current interval
            // this interval should be merged with the previous one, update end of interval at index
            res.add(intArrayOf(start, end))
            start = i[0]
            end = i[1]
        }
    }

    res.add(intArrayOf(start, end))
    return res.size
}