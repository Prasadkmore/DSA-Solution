/*
problem = [ Anagram Palindrome  ]

Given a string S, Check if characters of the given string can be rearranged to form a palindrome.
Note: You have to return 1 if it is possible to convert the given string into palindrome else return 0. 

Input:

S = "geeksogeeks"

Output: Yes
Explanation: The string can be converted
into a palindrome: geeksoskeeg

*/

class Sol
{
    int isPossible (String S)
    {
        // your code here
         int[] freq = new int[26]; 
         
    
        for (char c : S.toCharArray()) {
            freq[c - 'a']++; 
        }

        int oddCount = 0;
        for (int count : freq) {
            if (count % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                return 0; 
            }
        }
        return 1; 
    
    }
    
}