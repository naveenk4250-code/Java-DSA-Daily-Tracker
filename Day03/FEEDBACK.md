# Day 3 — 2026-08-03

| # | Problem | Topic | Difficulty | Score | Verdict |
|---|---------|-------|------------|-------|---------|
| 1 | Count Number of Digits | Loops, Number Manipulation | Easy | 10/10 | Accepted |
| 2 | Find the Largest Digit | Loops, Conditional Statements | Easy | 7/10 | Partially Accepted |
| 3 | Armstrong Number (3-Digit) | Loops, Mathematical Computation | Medium | 9/10 | Accepted |

## ChatGPT Feedback Detail

**1. Count Number of Digits** (`Day03/Solution1_NumberOfDigits.java`)

> Excellent solution. Correctly counted the number of digits by repeatedly dividing the number by 10 until it became zero. The implementation is simple, efficient, and follows the standard interview approach. Time Complexity: O(d), Space Complexity: O(1).

**2. Find the Largest Digit** (`Day03/Solution2_LargestNumber.java`)

> The overall approach is correct, but there is a logical error in the assignment statement. Inside the condition, 'dig = max' was used instead of 'max = dig', causing the maximum value to never update. Apart from this small mistake, the algorithm is appropriate and only requires correcting the assignment. Time Complexity: O(d), Space Complexity: O(1).

**3. Armstrong Number (3-Digit)** (`Day03/Solution3_ArmStrongNumber.java`)

> Good implementation. The program correctly stores the original number, extracts each digit, computes the cube using Math.pow(), and compares the final sum with the original number. A minor improvement is to use integer arithmetic (digit * digit * digit) instead of Math.pow() for better efficiency and to avoid floating-point operations. Additionally, the output message can be made more consistent with standard problem statements. Time Complexity: O(d), Space Complexity: O(1).

