# Day 13 — 2026-08-13

| # | Problem | Topic | Difficulty | Score | Verdict |
|---|---------|-------|------------|-------|---------|
| 1 | Count Frequency of Each Element | Arrays, Hashing | Easy | 7/10 | Partially Accepted |
| 2 | Second Largest Element | Arrays | Easy-Medium | 8/10 | Accepted |
| 3 | Remove Duplicate Characters | Strings, Hashing | Medium | 10/10 | Accepted |
| 4 | Maximum Consecutive Ones | Arrays | Medium | 10/10 | Accepted |
| 5 | Valid Parentheses | Stack | Medium | 7/10 | Partially Accepted |
| 6 | Majority Element | Arrays, Frequency Counting | Medium | 7/10 | Partially Accepted |

## ChatGPT Feedback Detail

**1. Count Frequency of Each Element** (`Day13/Solution1_FrequencyCount.java`)

> The logic is correct, but the solution only works for values between 0 and 9 because of the fixed-size frequency array. This is not a generic solution. In placement interviews, HashMap is the expected approach because it can handle any integer. The concept is correct, but the implementation needs improvement.

**2. Second Largest Element** (`Day13/Solution2_SecondLargest.java`)

> Good single-pass solution without sorting. However, initializing the largest and second-largest variables to 0 causes incorrect results when the array contains negative numbers. Using Integer.MIN_VALUE would make the solution more robust. The duplicate-handling logic is correct.

**3. Remove Duplicate Characters** (`Day13/Solution3_RemoveDuplicatesString.java`)

> Excellent implementation. LinkedHashSet automatically removes duplicates while preserving insertion order. Converting the set back into a string using StringBuffer is efficient and demonstrates a good understanding of Java collections.

**4. Maximum Consecutive Ones** (`Day13/Solution4_MaxConsecutiveOnes.java`)

> Perfect implementation. You correctly maintained a running count of consecutive 1s and reset it whenever a 0 appeared. The solution runs in O(n) time and uses O(1) extra space.

**5. Valid Parentheses** (`Day13/Solution5_Valid2.java`)

> The stack-based approach is correct, but the code does not check whether the stack is empty before calling pop(). Inputs such as ')' or ']}', will cause an EmptyStackException. The algorithm is correct, but the edge cases need to be handled.

**6. Majority Element** (`Day13/Solution7_MajorityElement.java`)

> The counting logic is correct, but the solution only works for values between 0 and 9 because of the fixed-size frequency array. The problem also requires printing -1 when no majority element exists, which is currently missing. In interviews, Moore's Voting Algorithm is the preferred solution.

