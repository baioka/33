### Problem 1. Vanilla Binary Search

Given an array of integers `A` which is sorted in ascending order, and an integer `key`, write a function to search `key` in `A`.
If `key` exists, then return its index. Otherwise, return `-1`.

You must write an algorithm with $O(\log n)$ runtime complexity.

Write your code in [Problem1.java](src/Problem1.java)

#### Example 1:

```
Input: A = [-1,0,3,5,9,12], key = 9
Output: 4
Explanation: 9 exists in A and its index is 4
```

#### Example 2:

```
Input: A = [-1,0,3,5,9,12], key = 2
Output: -1
Explanation: 2 does not exist in A so return -1
```


#### Constraints:

```
1 <= A.length <= 10000
-10000 < A[i], key < 10000
All the integers in A are unique.
A is sorted in ascending order.
```
