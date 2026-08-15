# Day 14 — 2026-08-14

| # | Problem | Topic | Difficulty | Score | Verdict |
|---|---------|-------|------------|-------|---------|
| 1 | Merge Two Sorted Arrays | Arrays, Two Pointers | Medium | 10/10 | Accepted |
| 2 | Anagram Strings | Strings, Hashing | Medium | 8/10 | Accepted |
| 3 | Best Time to Buy and Sell Stock | Arrays | Medium | 10/10 | Accepted |
| 4 | Sort an Array Containing 0s, 1s, and 2s | Arrays, Dutch National Flag Algorithm | Medium | 10/10 | Accepted |
| 5 | Next Greater Element | Stack | Hard | 10/10 | Accepted |

## ChatGPT Feedback Detail

**1. Merge Two Sorted Arrays** (`Day14/Solution1_MergeSortedArray.java`)

> Excellent implementation. You correctly used the two-pointer technique and handled the remaining elements after one array was exhausted. This is the standard interview solution. Time Complexity: O(n1 + n2), Space Complexity: O(n1 + n2).

**2. Anagram Strings** (`Day14/Solution2_AnagramStrings.java`)

> The frequency-array approach is efficient and avoids sorting. However, the final validation checks only for values greater than 0. It should verify that every frequency value is exactly 0. The solution also assumes that the input contains only lowercase English letters.

**3. Best Time to Buy and Sell Stock** (`Day14/Solution4_BestTimeToByStock.java`)

> Excellent work. Tracking the minimum price while calculating the maximum profit in a single traversal is the optimal solution. This is the exact approach commonly expected during placement interviews. Time Complexity: O(n), Space Complexity: O(1).

**4. Sort an Array Containing 0s, 1s, and 2s** (`Day14/Solution5_SortArray.java`)

> Perfect implementation of the Dutch National Flag algorithm. The low, mid, and high pointers are maintained correctly, and the array is sorted in a single pass. This is an interview-level solution.

**5. Next Greater Element** (`Day14/Solution7_NextGreaterElement.java`)

> Outstanding solution. You correctly used a monotonic stack and traversed the array from right to left. Using indices instead of storing values directly shows a deeper understanding of stack problems. This is the optimal O(n) solution expected in placements.

