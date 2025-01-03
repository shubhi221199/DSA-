class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
         char[]  strArray1 = s1.toCharArray();
         char[]  strArray2 = s2.toCharArray();
    
        Arrays.sort(strArray1);
        Arrays.sort(strArray2);
        
        return Arrays.equals(strArray1, strArray2);
    }
}