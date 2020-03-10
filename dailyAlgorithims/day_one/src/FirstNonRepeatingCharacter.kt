fun main(args: Array<String>) {
    val s = "aaabcccdeeef"
    print("${nonRepeatingCharacter(s)}")
}

//fun nonRepeatingCharacter(s: String): Char {
//// this will be big O(N2sq)
//    for (i in s.indices) { // first loop for checking the char in the string
//        var seenDuplicate = false // creating a variable to store the boolean
//        for (j in s.indices) { // second loop checking if the letter are duplicate
//            if (s[i] == s[j] && (i !=j)) { // if loop to check if a letter has been seen in first and second loop and are not of the same index
//                seenDuplicate = true // assert true the letter has been found.
//                break
//            }
//        }
//        if (!seenDuplicate) return s[i]
//    }
//    return '_'
//}

fun nonRepeatingCharacter(s: String): Char {
// linear Big O(N)
    //this will use hash map Big O(2N) == 0(N)
    var char_counts: HashMap<Char, Int> = HashMap()

    for (i in s.indices) { //loop to create the hash map
        var c = s[i]
        if (char_counts.containsKey(c)) { //checks if the key is in the hash map, if found it increments it
            char_counts.put(c, char_counts[c]!! + 1)
        } else {
            char_counts.put(c, 1)
        }
    }

    for (i in s.indices) { //loop to check the key that has a frequency of 1 it returns that one
        var c = s[i]
        if (char_counts[c] == 1) return c
    }

    return '_' // if none is found it should return this instead
}

////has an error
//fun nonRepeatingCharacter(s: String): Char {
//    //same as the hash map but using arrays
//    var char_counts: IntArray = intArrayOf(26)
//
//    for (c in s.toCharArray()) char_counts[c - 'a']
//
//    for (c in s.toCharArray()) {
//        if (char_counts[ c- 'a'] == 1) return c
//    }
//
//    return '_'
//}

//fun nonRepeatingCharacter(s: String): Char {
////    using the programming defined methods
////    using indexOf and lastIndexOf
//
//    for (i in s.indices) {
//        if (s.indexOf(s[i]) == s.lastIndexOf(s[i])) return s[i]
//    }
//
//    return '_'
//}