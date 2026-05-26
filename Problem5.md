### Problem 5. Search in Rotated Sorted Array

There is an integer array `A` sorted in ascending order (with distinct values).

Prior to being passed to your function, `A` is possibly left-rotated at an unknown index `k` (`1 <= k < A.length`) such that the resulting array is `[A[k], A[k+1], ..., A[n-1], A[0], A[1], ..., A[k-1]]` (0-indexed).

For example, `[0,1,2,4,5,6,7]` might be left rotated by `3` indices and become `[4,5,6,7,0,1,2]`.

Given the array `A` after the possible rotation and an integer `key`, return the index of `key` if it is in `A`, or `-1` if it is not in `A`.

You must write an algorithm with $O(\log n)$ runtime complexity.

Write your code in [Problem5.java](src/Problem5.java)

#### Example 1:
```
Input: A = [4,5,6,7,0,1,2], key = 0
Output: 4
```

#### Example 2:

```
Input: A = [4,5,6,7,0,1,2], key = 3
Output: -1
```

#### Example 3:

```
Input: A = [1], key = 0
Output: -1
```

#### Constraints:

```
1 <= A.length <= 5000
-10000 <= A[i] <= 10000
All values of A are unique.
A is an ascending array that is possibly rotated.
-10000 <= key <= 10000
```
 