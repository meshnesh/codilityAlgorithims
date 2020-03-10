fun main(args: Array<String>) {
    var s = 125
    print("${generateNum(s)}")
}

fun generateNum(N: Int): Int {
    return (Math.floor((N / 10).toDouble()) * 10).toInt()
}

