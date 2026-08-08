# Day 8 — 2026-08-08

| # | Problem | Topic | Difficulty | Score | Verdict |
|---|---------|-------|------------|-------|---------|
| 1 | Inverted Number Triangle | Patterns, Nested Loops | Easy | 8/10 | Accepted |
| 2 | Strong Number | Math, Loops | Medium | 9/10 | Accepted |
| 3 | Largest Element in Array | Arrays | Easy | 10/10 | Accepted |
| 4 | Smallest Element in Array | Arrays | Easy | 10/10 | Accepted |
| 5 | Reverse Array | Arrays, Two Pointers | Medium | 10/10 | Accepted |

## ChatGPT Feedback Detail

**1. Inverted Number Triangle** (`Day08/Solution1_InvertedNumberTriangle.java`)

> Logic is mostly correct, but there is a minor issue: outer loop runs from 0 to n (n+1 times), causing an extra empty line at the end. Ideally, it should run n times. Inner loop logic is correct. Clean pattern understanding. Time Complexity: O(n^2).

**2. Strong Number** (`Day08/Solution2_StrongNumber.java`)

> Good implementation. You correctly computed factorial for each digit and summed it. Nice handling of invalid input (n <= 0). Minor improvement: printing the sum is unnecessary in final output unless asked. Time Complexity: O(d * k) where d = digits, k = factorial loop.

**3. Largest Element in Array** (`Day08/Solution4_LargestElement.java`)

> Perfect implementation. Correct initialization and traversal. This is exactly how interviewers expect this problem to be solved. Time Complexity: O(n), Space: O(1).

**4. Smallest Element in Array** (`Day08/Solution5_SmallestElement.java`)

> Clean and correct solution. Proper comparison logic and traversal. Matches standard optimal approach. Time Complexity: O(n), Space: O(1).

**5. Reverse Array** (`Day08/Solution6_ReverseArray.java`)

> Excellent use of two-pointer technique. This is exactly the optimal approach expected in interviews. Clean swapping logic and efficient implementation. Time Complexity: O(n), Space: O(1).

