# [Construct Tree from Preorder & Postorder](https://www.geeksforgeeks.org/problems/construct-tree-from-preorder-postorder/1)
## Medium
Given two arrays&nbsp;pre[] and post[] that represent the preorder and postorder traversals of a full binary tree. Your task is to construct the binary tree and return its root.
Note: &nbsp;Full Binary Tree is a binary tree where every node has either 0 or 2 children. The preorder and postorder traversals contain unique values, and every value present in the preorder traversal is also found in the postorder traversal.
Examples:
Input: pre[] = [1, 2, 4, 8, 9, 5, 3, 6, 7], post[] = [8, 9, 4, 5, 2, 6, 7, 3, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Explanation: The tree will look like   
Input: pre[] = [1, 2, 4, 5, 3, 6, 7] , post[] = [4, 5, 2, 6, 7, 3, 1]
Output: [1, 2, 3, 4, 5, 6, 7]Explanation: The tree will look like   
Constraints:1 ≤ number of nodes ≤ 1031 ≤ pre[i], post[i] ≤ 104