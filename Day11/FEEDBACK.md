# Day 11 — 2026-08-11

| # | Problem | Topic | Difficulty | Score | Verdict |
|---|---------|-------|------------|-------|---------|
| 1 | Maximum Difference | Arrays, Greedy Logic | Easy | 10/10 | Accepted |
| 2 | Armstrong Number | Numbers, Mathematical Logic | Easy | 8/10 | Accepted |
| 3 | Rotate Array by One Position | Arrays, Reversal Technique | Medium | 10/10 | Accepted |
| 4 | Toggle Case of Characters | Strings, Character Manipulation | Easy | 10/10 | Accepted |
| 5 | First Non-Repeating Character | Strings, Frequency Counting | Medium | 9/10 | Accepted |

## ChatGPT Feedback Detail

**1. Maximum Difference** (`Day11/Solution1_MaxDifference.java`)

> Excellent solution. You correctly maintained the minimum element seen so far and calculated the maximum valid difference with a later element. The solution uses a single traversal without sorting. Time Complexity: O(n), Space Complexity: O(1).

**2. Armstrong Number** (`Day11/Solution2_ArmStrongNumber.java`)

> The solution correctly checks the 3-digit Armstrong-number condition. The main improvements are to avoid Math.pow() when integer multiplication is sufficient and to avoid returning an unused value from the method. Time Complexity: O(d), Space Complexity: O(1).

**3. Rotate Array by One Position** (`Day11/Solution3_RotateArray.java`)

> Correct implementation. You correctly used the reversal technique: first reverse the entire array, then reverse the elements from index 1 to the end. For example, [1,2,3,4,5] becomes [5,1,2,3,4]. This is an in-place O(n) solution with O(1) extra space. Good improvement from the previous version.

**4. Toggle Case of Characters** (`Day11/Solution5_ToggleCase.java`)

> Excellent implementation. Correctly toggles lowercase and uppercase characters and uses StringBuilder for efficient string construction. Time Complexity: O(n), Space Complexity: O(n).

**5. First Non-Repeating Character** (`Day11/Solution6_FirstNonRepeatingCh.java`)

> Good frequency-array approach with two traversals. It correctly preserves the original order while finding the first character whose frequency is one. The implementation assumes lowercase English letters and should explicitly handle the case where no non-repeating character exists. Time Complexity: O(n), Space Complexity: O(1) for lowercase English letters.

