# Day 12 — 2026-08-12

| # | Problem | Topic | Difficulty | Score | Verdict |
|---|---------|-------|------------|-------|---------|
| 1 | Find Duplicate Element | Arrays, HashSet | Easy | 8/10 | Accepted |
| 2 | Intersection of Two Arrays | Arrays, HashSet | Easy-Medium | 9/10 | Accepted |
| 3 | Longest Substring Without Repeating Characters | Strings, Sliding Window | Medium | 9/10 | Accepted |
| 4 | Maximum Sum Subarray of Size K | Arrays, Sliding Window | Medium | 8/10 | Partially Accepted |
| 5 | Palindrome Number | Numbers, Mathematical Logic | Easy | 10/10 | Accepted |

## ChatGPT Feedback Detail

**1. Find Duplicate Element** (`Day12/Solution1_FindDuplicate.java`)

> Correct use of HashSet to detect duplicates in a single traversal. However, the method prints every duplicate instead of returning a duplicate element, and the return value is always 0 and therefore unnecessary. If the requirement is to find any one duplicate, return immediately when a duplicate is detected. Time Complexity: O(n) average, Space Complexity: O(n).

**2. Intersection of Two Arrays** (`Day12/Solution2_insersectionOfArrays.java`)

> Good HashSet-based solution. You correctly store the first array in a set, check elements of the second array, and remove matched elements so duplicates are not printed repeatedly. The unused 'found' variable and dummy return value should be removed. The current implementation assumes both arrays have the same size because only one n is provided. Time Complexity: O(n) average, Space Complexity: O(n).

**3. Longest Substring Without Repeating Characters** (`Day12/Solution3_LongestSubString.java`)

> Correct sliding-window logic. You expand the window when the character is new and move the start forward when a duplicate is found. The main issue is performance: ArrayList.contains() and remove() are O(n), making the overall solution O(n²) in the worst case. A HashSet can reduce this to O(n) average time. Good understanding of the sliding-window concept.

**4. Maximum Sum Subarray of Size K** (`Day12/Solution4_MaximumSubArray.java`)

> The inner loop correctly calculates each window of size k, but the outer loop uses i < n-k instead of i <= n-k, so the final possible window is skipped. The sample may still produce 39 because the skipped window is not the maximum, but the algorithm is not correct for every input. Also, initializing max to 0 fails when all possible window sums are negative. Your approach is currently O(n*k); the expected placement optimization is O(n) using a sliding window.

**5. Palindrome Number** (`Day12/Solution5_PalindromeNumber.java`)

> Correct and clean implementation. You preserve the original number, reverse the digits using modulus and division, and compare the reversed value with the original. The solution is efficient for the intended problem. Time Complexity: O(d), Space Complexity: O(1). The return value of 0 is unnecessary because the method only performs the check and prints the result.

