/*  ******************Palindrome Array**********************

  Given an array arr, the task is to find whether the arr is palindrome or not. If the arr is palindrome then return true else return false.

    An array is said to be palindrome if its reverse array matches the original array. 


Examples:

Input: arr = [1, 2, 3, 2, 1]
Output: true
Explanation: Here we can see we have [1, 2, 3, 2, 1] if we reverse it we can find [1, 2, 3, 2, 1] which is the same as before. So, the answer is true.


class   PalindromeArray {
    public static boolean isPerfect(int[] arr) {
        // code here
       int start = 0, end = arr.length - 1;
        
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }
        return true; // It's a palindrome
    }

    }

*/