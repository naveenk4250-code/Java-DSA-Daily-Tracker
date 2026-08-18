# Day 16 — 2026-08-18

| # | Problem | Topic | Difficulty | Score | Verdict |
|---|---------|-------|------------|-------|---------|
| 1 | Rotate Array by K Positions | Arrays, Reversal Algorithm | Medium | 10/10 | Accepted |
| 2 | Find the Missing Number | Arrays, Mathematical Computation | Easy | 10/10 | Accepted |
| 3 | Kth Largest Element in an Array | Arrays, Sorting | Easy | 8/10 | Accepted |
| 4 | Reverse the Order of Words in a String | Strings, Arrays | Easy | 9/10 | Accepted |
| 5 | Search in a Rotated Sorted Array | Arrays, Searching | Medium | 6/10 | Partially Accepted |

## ChatGPT Feedback Detail

**1. Rotate Array by K Positions** (`Day16/Solution1_RotateArrayByKPos.java`)

> Excellent solution. The program correctly implements the reversal algorithm to rotate the array by k positions. The value of k is normalized using the modulo operator, preventing unnecessary rotations when k is greater than the array size. The array is reversed entirely, followed by reversing the first k elements and the remaining elements. This is the standard interview approach because it performs the rotation in place without requiring an additional array. A minor improvement would be to move the printing logic outside the main algorithm. Time Complexity: O(n), Space Complexity: O(1).

**2. Find the Missing Number** (`Day16/Solution2_MissingNumber.java`)

> Very good implementation. The solution correctly calculates the sum of the given array and compares it with the expected sum of the first n natural numbers using the mathematical formula n(n+1)/2. The difference between the two sums correctly identifies the missing number. The approach is efficient because it avoids sorting or using additional data structures. A minor improvement would be to use more descriptive variable names such as expectedSum instead of ActualSum. Time Complexity: O(n), Space Complexity: O(1).

**3. Kth Largest Element in an Array** (`Day16/Solution3_KthLargestElement.java`)

> The implementation correctly sorts the array and retrieves the kth largest element by accessing the index n-k. The algorithm produces the correct output and is easy to understand. However, sorting the entire array is not the most efficient solution because only one element is required. In interviews, a Priority Queue or QuickSelect-based solution is usually preferred for better performance. Additionally, the method returns 0 instead of returning the identified element, which reduces the method's reusability. Time Complexity: O(n log n), Space Complexity: O(1), excluding the internal space used by the sorting algorithm.

**4. Reverse the Order of Words in a String** (`Day16/Solution4_ReverseWords.java`)

> Good implementation. The program correctly separates the sentence into individual words using the split() method and prints them in reverse order. The solution is simple and produces the expected output. However, the method currently returns the original string instead of returning the reversed result. Constructing and returning a new string would improve reusability and make the method more consistent. Time Complexity: O(n), Space Complexity: O(n).

**5. Search in a Rotated Sorted Array** (`Day16/Solution5_SearchInRotatedArray.java`)

> The solution correctly identifies whether the target element exists and prints its index. However, the implementation performs a linear search and does not take advantage of the properties of a rotated sorted array. The standard interview solution uses a modified binary search to achieve logarithmic performance. Because the problem specifically focuses on searching within a rotated sorted array, using a linear traversal does not fully satisfy the expected approach. Additionally, the method returns the target value instead of returning the element's index. Time Complexity: O(n), Space Complexity: O(1).

