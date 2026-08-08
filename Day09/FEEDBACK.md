# Day 9 — 2026-08-08

| # | Problem | Topic | Difficulty | Score | Verdict |
|---|---------|-------|------------|-------|---------|
| 1 | Sum of Array Elements | Arrays, Traversal | Easy | 10/10 | Accepted |
| 2 | Count Even and Odd Numbers | Arrays | Easy | 10/10 | Accepted |
| 3 | Palindrome String | Strings | Medium | 8/10 | Accepted |
| 4 | Second Smallest Element | Arrays | Medium | 10/10 | Accepted |
| 5 | Count Words in Sentence | Strings | Easy | 9/10 | Accepted |
| 6 | Frequency of Elements | Arrays, Frequency Count | Medium | 7/10 | Partially Accepted |
| 7 | Remove Duplicates | Arrays, Hashing | Medium | 8/10 | Accepted |

## ChatGPT Feedback Detail

**1. Sum of Array Elements** (`Day09/Solution1_ArraySum.java`)

> Clean and correct solution. Proper array input and summation logic. This is exactly what is expected in interviews. Time Complexity: O(n).

**2. Count Even and Odd Numbers** (`Day09/Solution2_CountEvenOdd.java`)

> Perfect implementation. Correct use of modulo and clear output formatting. No issues.

**3. Palindrome String** (`Day09/Solution3_PalindromeString.java`)

> Logic is correct, but inefficient due to string concatenation inside loop (O(n^2)). Also printing reversed string is unnecessary. In interviews, prefer StringBuilder. Minor deduction.

**4. Second Smallest Element** (`Day09/Solution4_SecondSmallest.java`)

> Excellent. Optimal single-pass solution without sorting. Handles duplicates properly. Interview-level solution.

**5. Count Words in Sentence** (`Day09/Solution5_NoOfWords.java`)

> Good approach using split(). However, it may fail for multiple spaces or trailing spaces. Consider trimming input or using regex split. Minor improvement needed.

**6. Frequency of Elements** (`Day09/Solution6_FrequencyOfDigits.java`)

> Works only when elements are between 0–9 due to fixed array size (10). Not a general solution. In interviews, you must use HashMap for arbitrary values. Concept is right but implementation is limited.

**7. Remove Duplicates** (`Day09/Solution7_RemoveDuplicates.java`)

> Good recovery from previous mistake. Correct use of HashSet to remove duplicates. However, input is hardcoded and order is not preserved (HashSet is unordered). For interviews, prefer LinkedHashSet or manual approach.

