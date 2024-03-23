/*

Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 */


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