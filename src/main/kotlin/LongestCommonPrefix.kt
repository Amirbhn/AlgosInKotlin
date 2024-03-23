fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""

    var prefix = strs[0]

    for (i in 1 until strs.size) {
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(
                0, prefix.length - 1
            )
        }
    }



    return prefix
}

fun main() {
    val strs1 = arrayOf("flower", "flow", "flight")
    println("Longest common prefix: ${longestCommonPrefix(strs1)}")

    val strs2 = arrayOf("dog", "racecar", "car")
    println("Longest common prefix: ${longestCommonPrefix(strs2)}")

}