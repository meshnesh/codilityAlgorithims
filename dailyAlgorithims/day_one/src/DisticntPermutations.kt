fun printPermutation(str: String, ans: String) {
    if (str.isEmpty()) {
        // print ans
        print("$ans ")
        return
    }

    val alpha = BooleanArray(26)

    for (i in str.indices) {
        val ch = str[i] // index of the str
        val ros = str.substring(0, i) + str.substring(i + 1) // swap the letters in their positions`

//        printPermutation(ros, ans + ch) //prints all the words in the str.indeces

        if (!alpha[ch - 'a']) printPermutation(ros, ans + ch)
        alpha[ch - 'a'] = true // checks the length and if word is repeated
    }
}

fun main(args: Array<String>) {
    val s = "me"
    printPermutation(s, "")
}
