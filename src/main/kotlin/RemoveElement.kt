/*

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.

*/




fun removeElement(nums: IntArray, `val`: Int): Int {
    var validSize = 0

    for (num in nums.indices) {
        if (nums[num] != `val`) {
            nums[validSize] = nums[num]
            validSize++
        }
    }

    return validSize
}


fun main() {
    val nums = arrayOf(3, 2, 2, 3, 5, 3, 5, 1, 3).toIntArray()
    val `val` = 3
    println(removeElement(nums, `val`))
}