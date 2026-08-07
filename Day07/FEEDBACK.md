# Day 7 — 2026-08-07

| # | Problem | Topic | Difficulty | Score | Verdict |
|---|---------|-------|------------|-------|---------|
| 1 | Inverted Right Triangle | Nested Loops, Pattern Printing | Easy | 10/10 | Accepted |
| 2 | Number Triangle | Nested Loops, Number Patterns | Easy | 10/10 | Accepted |
| 3 | Sum of Factors | Loops, Divisibility | Medium | 10/10 | Accepted |
| 4 | Perfect Number | Loops, Mathematical Logic | Medium | 10/10 | Accepted |
| 5 | Count Vowels | Strings | Easy | 8/10 | Partially Accepted |
| 6 | Reverse Each Word | Strings | Medium | 9/10 | Accepted |
| 7 | Second Largest Element | Arrays | Medium | 10/10 | Accepted |

## ChatGPT Feedback Detail

**1. Inverted Right Triangle** (`Day07/Solution1_InvertedRightTriangle.java`)

> Excellent implementation. Correctly used nested loops to print an inverted right-angled triangle. The outer loop controls the rows while the inner loop decreases the number of stars in each iteration. The logic is simple, clean, and follows the standard pattern-printing approach. Time Complexity: O(n²), Space Complexity: O(1).

**2. Number Triangle** (`Day07/Solution2_NumberTriangle.java`)

> Very good solution. Correctly printed numbers from 1 to the current row using nested loops. The implementation is clean and easy to understand. Time Complexity: O(n²), Space Complexity: O(1).

**3. Sum of Factors** (`Day07/Solution3_SumOfFactors.java`)

> Excellent implementation. Correctly identified all factors of the given number and accumulated their sum. The logic is correct and follows the expected beginner approach. Time Complexity: O(n), Space Complexity: O(1).

**4. Perfect Number** (`Day07/Solution4_PerfectNumber.java`)

> Good implementation. Correctly summed all proper divisors and compared the result with the original number to determine whether it is a Perfect Number. The algorithm is accurate and handles the required logic correctly. Time Complexity: O(n), Space Complexity: O(1).

**5. Count Vowels** (`Day07/Solution5_CountVowels.java`)

> The overall approach is correct, but there is an off-by-one error in the loop condition. The loop iterates until 'str.length() - 1', causing the last character of the string to be skipped. As a result, vowels appearing at the end of the string are not counted. Changing the loop condition to iterate until 'i < str.length()' fixes the issue. Additionally, consider checking uppercase vowels for a more complete solution. Time Complexity: O(n), Space Complexity: O(1).

**6. Reverse Each Word** (`Day07/Solution6_ReverseEachWord.java`)

> Good solution. Correctly split the sentence into words and reversed each word individually while preserving the word order. One improvement is to read the sentence from user input instead of using a hardcoded string, making the program reusable for any input. Time Complexity: O(n), Space Complexity: O(n).

**7. Second Largest Element** (`Day07/Solution7_SecondLargest.java`)

> Excellent implementation. Correctly maintained the largest and second-largest distinct elements in a single traversal without sorting the array. The solution efficiently handles duplicate largest values and follows the optimal interview approach. Time Complexity: O(n), Space Complexity: O(1).

