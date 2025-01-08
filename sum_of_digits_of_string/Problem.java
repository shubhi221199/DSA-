class Solution {
    public int getLucky(String str, int k) {
        int sum = 0;
        String concatenatedString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int convertNum = (ch - 'a' + 1);
            concatenatedString += convertNum;

        }
        String strr = concatenatedString;
        while (k != 0) {
            sum = 0;
            System.out.println("strr Upper" + " = " + strr);
            for (int i = 0; i < strr.length(); i++) {
                char ch = strr.charAt(i);
                int number = ch - '0';
                sum += number;
                System.out.println("sum" + " = " + sum);

            }
            strr = Integer.toString(sum);
            System.out.println("strr" + " = " + strr);
            k--;
        }

        System.out.println(concatenatedString);
        return sum;
    }
}