# [Kth from End of Linked List](https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1)
## Easy
Given the head of a linked list and an integer k, return the kth node from the end of the linked list. If k is greater than the number of nodes in the list, return -1.

Examples :
Input: head: 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6-&gt;7-&gt;8-&gt;9, k = 2Output: 8
Explanation: The given linked list is 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6-&gt;7-&gt;8-&gt;9. The 2nd node from end is 8.
Input: head: 10-&gt;5-&gt;100-&gt;5, k = 5Output: -1
Explanation: The given linked list is 10-&gt;5-&gt;100-&gt;5. Since 'k' is more than the number of nodes, the output is -1.
Constraints:1 ≤ number of nodes ≤ 1061 ≤ node-&gt;data , x ≤ 1061 ≤ k ≤ 106
