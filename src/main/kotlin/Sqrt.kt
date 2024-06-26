/*

Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

*/

fun mySqrt(x: Int): Int {
    if (x < 2) return x

    var left = 1
    var right = x
    var result = 0

    while (left <= right) {
        val mid = left + (right - left) / 2
        if (mid <= x / mid) {
            left = mid + 1
            result = mid
        } else {
            right = mid - 1
        }
    }
    return result
}

fun main(){
    println( mySqrt(18))
}