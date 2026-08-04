# Day 4 — 2026-08-04

| # | Problem | Topic | Difficulty | Score | Verdict |
|---|---------|-------|------------|-------|---------|
| 1 | Find the Smallest Digit | Loops, Conditional Statements | Easy | 10/10 | Accepted |
| 2 | Prime or Not | Loops, Mathematical Logic | Medium | 9/10 | Accepted |
| 3 | Factorial of a Number | Loops, Iterative Computation | Medium | 10/10 | Accepted |

## ChatGPT Feedback Detail

**1. Find the Smallest Digit** (`Day04/Solution1_SmallestDigit.java`)

> Excellent implementation. Initialized the minimum digit using the last digit of the number, then correctly traversed every remaining digit using modulus (%) and integer division (/). Updated the minimum whenever a smaller digit was found. The solution is efficient, clean, and follows the expected interview approach. Time Complexity: O(d), Space Complexity: O(1).

**2. Prime or Not** (`Day04/Solution2_PrimeOrNot.java`)

> Good implementation. Correctly handled the edge case where numbers less than 2 are not prime and used a loop to check divisibility. The use of a boolean flag and early break improves readability. A minor optimization is to check divisors only up to the square root of the number instead of checking until n - 1, which significantly improves efficiency for larger inputs. Current Time Complexity: O(n), Optimized Complexity: O(√n), Space Complexity: O(1).

**3. Factorial of a Number** (`Day04/Solution3_Factorial.java`)

> Well implemented. Correctly handled the special cases of 0! and 1! and used a long variable to prevent overflow for smaller factorial values. The iterative multiplication approach is the standard interview solution. The code is clean, readable, and efficient. Time Complexity: O(n), Space Complexity: O(1).

