
/*

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]

*/

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var tempNode = ListNode(0)
    var current: ListNode? = tempNode
    var l1 = list1
    var l2 = list2

    while (l1 != null && l2 != null) {
        if (l1.`val` < l2.`val`) {
            current?.next = l1
            l1 = l1.next
        } else {
            current?.next = l2
            l2 = l2.next
        }
        current = current?.next
    }

    if (l1 != null) {
        current?.next = l1
    }

    if (l2 != null) {
        current?.next = l2
    }

    return tempNode.next
}