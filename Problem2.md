### Problem 2. Search Insert Position

Given a sorted array of distinct integers and a key value, return the index if the key is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with $O(\log n)$ runtime complexity.

Write your code in [Problem2.java](src/Problem2.java)

#### Example 1:

```
Input: A = [1,3,5,6], key = 5
Output: 2
```

#### Example 2:

```
Input: A = [1,3,5,6], key = 2
Output: 1
```

#### Example 3:

```
Input: A = [1,3,5,6], key = 7
Output: 4
```

#### Constraints:

```
1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A contains distinct values sorted in ascending order.
-10000 <= key <= 10000
```