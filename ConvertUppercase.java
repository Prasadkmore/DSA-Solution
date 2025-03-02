/*
     Given a string s, convert the first letter of each word in the string to uppercase. 

    Input: s = "i love programming"
    Output: "I Love Programming"

   
   class ConvertUppercase {
    public String convert(String s) {
        // code here
        
         StringBuilder original = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isWhitespace(ch)) {
                capitalizeNext = true; 
                original.append(ch);   
                
            } else if (capitalizeNext) {
                original.append(Character.toUpperCase(ch)); 
                capitalizeNext = false; 
                
            } else {
                original.append(Character.toLowerCase(ch)); 
            }
        }

        return original.toString();
    }
    
}
*/