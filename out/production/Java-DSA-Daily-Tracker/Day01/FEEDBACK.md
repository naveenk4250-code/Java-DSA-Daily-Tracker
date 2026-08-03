# Day 1 — 2026-08-03

| # | Problem | Topic | Difficulty | Score | Verdict |
|---|---------|-------|------------|-------|---------|
| 1 | Two Sum | Arrays & HashMap | Easy | 9/10 | Accepted |
| 2 | Reverse a String In Place | Two Pointers | Easy | 10/10 | Accepted |
| 3 | Valid Parentheses | Stack | Medium | 7/10 | Partially Accepted |

## ChatGPT Feedback Detail

**1. Two Sum** (`Day01/Solution1_TwoSum.java`)

> Correct O(n) approach using HashMap. Minor deduction: didn't explicitly handle the case where no pair exists (falls through with a bare return null).

**2. Reverse a String In Place** (`Day01/Solution2_ReverseString.java`)

> Clean two-pointer swap, O(1) space, handled odd/even length correctly.

**3. Valid Parentheses** (`Day01/Solution3_ValidParentheses.java`)

> Logic works for balanced brackets, but missed the empty-stack edge case on a closing bracket with nothing to pop against — would throw instead of returning false.

