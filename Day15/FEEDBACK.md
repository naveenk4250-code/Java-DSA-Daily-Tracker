# Day 15 — 2026-08-17

| # | Problem | Topic | Difficulty | Score | Verdict |
|---|---------|-------|------------|-------|---------|
| 1 | Product of Array Except Self | Arrays, Prefix Product, Suffix Product | Medium | 10/10 | Accepted |
| 2 | Move Zeros to End | Arrays, Two Pointers | Easy | 10/10 | Accepted |
| 3 | Check Whether Two Strings Are Rotations | Strings, String Manipulation | Easy | 9/10 | Accepted |
| 4 | Find Pairs With Given Difference | Arrays, Sorting, Two Pointers | Medium | 9/10 | Accepted |

## ChatGPT Feedback Detail

**1. Product of Array Except Self** (`Day15/Solution1_ProductExceptSelf.java`)

> Excellent solution. The implementation correctly uses the prefix-product and suffix-product approach without using division, which is considered the standard interview solution. The first traversal calculates the product of all elements to the left of each index, while the second traversal computes the product of all elements to the right. The algorithm handles zero values correctly and avoids unnecessary nested loops. A minor improvement would be to separate the computation and output logic by moving the printing statements outside the method. Time Complexity: O(n), Space Complexity: O(n).

**2. Move Zeros to End** (`Day15/Solution2_MoveZerosToEnd.java`)

> Very good implementation. The program efficiently shifts all non-zero elements toward the beginning of the array while maintaining their original order. The remaining positions are then filled with zeros. This in-place approach is optimal because it avoids unnecessary swapping operations and requires only a single traversal of the array. Similar to the previous solution, separating the output logic from the processing method would improve code reusability. Time Complexity: O(n), Space Complexity: O(1).

**3. Check Whether Two Strings Are Rotations** (`Day15/Solution3_RotationOfEachOther.java`)

> Good implementation. The program correctly validates that both strings have the same length and immediately terminates when the lengths differ. It then concatenates the first string with itself and uses the contains() method to determine whether the second string is a valid rotation. This is the standard and most commonly accepted interview solution. However, there is still a redundant length comparison after creating the concatenated string. Since the method already returns when the lengths differ, the second condition will never be executed and should be removed. Additionally, the method name can be made more descriptive. Time Complexity: O(n), Space Complexity: O(n).

**4. Find Pairs With Given Difference** (`Day15/Solution5_DiffOfAllPairs.java`)

> Good implementation. The solution correctly sorts the array and applies the two-pointer technique to identify all pairs with the specified difference. Additional logic is included to avoid duplicate pairs, which improves the overall quality of the algorithm. One limitation is that the original array is modified during sorting. If preserving the input order is important, a copy of the array should be created before sorting. Furthermore, returning the identified pairs instead of printing them would improve the method's reusability. Time Complexity: O(n log n), Space Complexity: O(1), excluding the internal space used by the sorting algorithm.

