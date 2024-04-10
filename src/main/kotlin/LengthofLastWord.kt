/*

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.


*/



fun lengthOfLastWord(s: String): Int {
    val words = s.trim().split(" ")
    return words.last().length
}

fun main() {
    val input1 = "Hello World"
    val input2 = "   fly me   to   the moon  "
    val input3 = "luffy is still joyboy"

    println(lengthOfLastWord(input1)) //5
    println(lengthOfLastWord(input2)) //4
    println(lengthOfLastWord(input3)) //6
}