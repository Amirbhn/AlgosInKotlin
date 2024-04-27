/*
Given two binary strings a and b, return their sum as a binary string.
Example 1:
Input: a = "11", b = "1"
Output: "100"
Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

Constraints:
1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */


fun addBinary(a: String, b: String): String {
    var i = a.length - 1
    var j = b.length - 1
    var carry = 0
    val result = StringBuilder()

    while (i >= 0 || j >= 0 || carry > 0) {
        val sum = carry +
                (if (i >= 0) a[i--] - '0' else 0) +
                (if (j >= 0) b[j--] - '0' else 0)
        result.append(sum % 2)
        carry = sum / 2
    }

    return result.reverse().toString()
}

fun main() {
    println(addBinary("11", "1")) // Output: "100"
    println(addBinary("1010", "1011")) // Output: "10101"
}
