# [Rotate a Linked List](https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1)
## Medium
You are given the head of a singly linked list, you have to left rotate the linked list&nbsp;k times. Return the head of the modified linked list.
Examples:
Input: k = 4,   Output: 50 -&gt; 10 -&gt; 20 -&gt; 30 -&gt; 40
Explanation:Rotate 1: 20 -&gt; 30 -&gt; 40 -&gt; 50 -&gt; 10Rotate 2: 30 -&gt; 40 -&gt; 50 -&gt; 10 -&gt; 20Rotate 3: 40 -&gt; 50 -&gt; 10 -&gt; 20 -&gt; 30Rotate 4: 50 -&gt; 10 -&gt; 20 -&gt; 30 -&gt; 40   
Input: k = 6,   Output: 30 -&gt; 40 -&gt; 10 -&gt; 20    
Constraints:1 ≤ number of nodes ≤ 1050 ≤ k ≤ 1090 ≤ node.data ≤ 109