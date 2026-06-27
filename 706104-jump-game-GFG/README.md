# [Jump Game](https://www.geeksforgeeks.org/problems/jump-game/1)
## Medium
Given a array of positive integers arr, where each element denotes the maximum length of jump you can cover. Find out if you can make it to the last index starting from the first index of the list, return true if you can reach the last index.
Examples:
Input: arr = [1, 2, 0, 3, 0, 0] 
Output: true
Explanation: Jump 1 step from first index to second index. Then jump 2 steps to reach 4th index, and now jump 2 steps to reach the end.

Input: arr = [1, 0, 2]
Output: false
Explanation: You can't reach the end of the array.

Constraints:1 &lt;= arr.size() &lt;= 1050 &lt;= arr[i] &lt;= 105