class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String ans[] = new String[n];
        int[] sortedArray = Arrays.copyOf(score, n);
        Arrays.sort(sortedArray);
        for (int i = 0; i < n; i++) {
            int num = score[i];
            for (int j = 0; j < n; j++) {
                if(num == sortedArray[j]){
                    ans[i] = getPosition(n-j-1);
                }
            }
        }
        return ans;
    }

    public static String getPosition(int i){
        switch(i){
            case 0:
            return "Gold Medal";
            case 1:
            return "Silver Medal";
            case 2:
            return "Bronze Medal";
            default:
            return ""+ (i+1);
        }
    }
}