class Solution {
    public int strStr(String haystack, String needle) {
        int ans = -1;
        int start = 0;
        int windowSize = needle.length();
        for (int i = 0; i < haystack.length(); i++) {
            System.out.println(haystack.charAt(i) + " " + needle.charAt(start));
            if (haystack.charAt(i) == needle.charAt(start)) {
                if (i + windowSize > haystack.length()) {
                    return -1;
                }
                for (int j = i; j < i + windowSize; j++) {
                    if (haystack.charAt(j) == needle.charAt(start)) {
                        start++;
                    }else{
                        break;
                    }
                    if (j - i == windowSize - 1) {
                        ans = j - (windowSize - 1);
                        return ans;
                    }
                }
                start = 0;
            }
        }
        return ans;
    }
}