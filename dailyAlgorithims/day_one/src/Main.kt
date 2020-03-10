//fun main() {
//    val message = "The quick brown fox jumps over the lazy dog"
//    val K = 39
//    println("${solution(message, K)}")
//}
//
//fun solution(message: Int, K: Int): String {
//    // write your code in Kotlin
//    var i = K - 1
//    if (message.length < K) {
//        return message
//    }
//    if(message.length > K && message[K] == ' ')
//        return message.substring(0, K)
//    while (i > 0) {
//        if (message.get(i) == ' ') {
//            return message.substring(0, i)
//        }
//        i -= 1
//    }
//    return message
//}
//
//
////internal class Solution {
////    /**
////     * Solutions
////     * @param S
////     * @return
////     */
////    fun solution(S: String): Int {
////        var total = 0
////        var max = 0
////        var sec: Int
////        val lines = S.split("\n".toRegex()).toTypedArray()
////        val phonesTime = HashMap<String, Int?>()
////        Arrays.stream(lines)
////            .map { s: String ->
////                s.split(",".toRegex()).toTypedArray()
////            }.forEach { line: Array<String> ->
////                val phone = line[1]
////                val time = timeToSecs(line[0])
////                //Sum up same phone number into one
////                if (phonesTime.containsKey(phone)) {
////                    val oldTime = phonesTime[phone]!!
////                    phonesTime[phone] = oldTime + time
////                } else {
////                    phonesTime[phone] = time
////                }
////            }
////        for (key in phonesTime.keys) {
////            sec = phonesTime[key]!!
////            if (sec >= max) {
////                max = sec
////            }
////            total += secsToCents(sec)
////        }
////        //remove promotion rebate
////        total -= secsToCents(max)
////        return total
////    }
////
////    companion object {
////        /**
////         * Business logic
////         * @param sec
////         * @return
////         */
////        private fun secsToCents(sec: Int): Int {
////            return if (sec < 300) sec * 3 else if (sec % 60 == 0) sec / 60 * 150 else (sec / 60 + 1) * 150
////        }
////
////        /**
////         * timeToSecs
////         * @param time
////         * @return
////         */
////        private fun timeToSecs(time: String): Int {
////            val dateFormat: DateFormat = SimpleDateFormat("HH:mm:ss")
////            var date: Date? = null
////            var reference: Date? = null
////            try {
////                reference = dateFormat.parse("00:00:00")
////                date = dateFormat.parse(time)
////            } catch (ex: Exception) {
////            }
////            val seconds: Long = (date!!.getTime() - reference!!.getTime()) / 1000L
////            return Math.toIntExact(seconds)
////        }
////
////        @JvmStatic
////        fun main(args: Array<String>) {
////            val S = "00:01:07,400-234-090\n" +
////                    "00:05:01,701-080-080\n" +
////                    "00:05:00,400-234-090"
////            val s = Solution()
////            val solution = s.solution(S)
////            println(solution)
////        }
////    }
////}
