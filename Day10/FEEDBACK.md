# Day 10 — 2026-08-09

| # | Problem | Topic | Difficulty | Score | Verdict |
|---|---------|-------|------------|-------|---------|
| 1 | Average of Array | Arrays | Easy | 9/10 | Accepted |
| 2 | Count Positive, Negative and Zero | Arrays | Easy | 8/10 | Accepted |
| 3 | Reverse String | Strings | Medium | 7/10 | Accepted |
| 4 | Move Zeros to End | Arrays, Two Pointers | Medium | 10/10 | Accepted |
| 5 | Find Length of String Without length() | Strings | Easy | 5/10 | Partially Accepted |
| 6 | Check Equal Arrays | Arrays | Easy | 8/10 | Accepted |
| 7 | Missing Number | Arrays, Math | Medium | 10/10 | Accepted |

## ChatGPT Feedback Detail

**1. Average of Array** (`Day10/Solution1_AverageOfArray.java`)

> Correct implementation with proper traversal. However, integer division is used which may lead to loss of precision. In interviews, consider returning double for accurate average.

**2. Count Positive, Negative and Zero** (`Day10/Solution2_CountPosNeg.java`)

> Logic is correct and clean. However, method design is poor as it returns a dummy value and handles printing internally. In interviews, separate logic and output, and return meaningful data.

**3. Reverse String** (`Day10/Solution3_ReverseString.java`)

> Functionally correct, but inefficient due to string concatenation inside loop leading to O(n^2) complexity. In interviews, use StringBuilder for optimal performance.

**4. Move Zeros to End** (`Day10/Solution4_ZerosToEnd.java`)

> Excellent implementation using two-pointer approach. Optimal O(n) solution and maintains relative order. This is a standard placement-level pattern.

**5. Find Length of String Without length()** (`Day10/Solution5_FindLength.java`)

> Uses exception handling to control loop termination, which is a bad practice. Exceptions should not be used for normal logic. Interviewers expect a loop-based or traversal approach.

**6. Check Equal Arrays** (`Day10/Solution6_EqualArray.java`)

> Correct comparison logic. However, missing edge case check for different array lengths. Always validate sizes before element comparison.

**7. Missing Number** (`Day10/Solution7_MissingNumber.java`)

> Correct and efficient implementation using sum formula. Optimal O(n). Good understanding of problem. Can be further optimized using XOR approach for interview depth.

