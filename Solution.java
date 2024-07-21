class Solution {
    public static void main(String[] args) {
        System.out.println("helos");

        String s = "abakjsdflk";
        String longestStr = "";
        char ch;
        String nstr = "";

        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
                String subStr = s.substring(i, j);

                if (subStr.length() > 0) {
                    String[] strArray = subStr.split("");

                    for (int k = 1; k < strArray.length; k++) {
                        ch = subStr.charAt(k);
                        nstr = ch + nstr;
                    }

                    if (subStr == nstr) {
                        if (longestStr.length() < subStr.length()) {
                            longestStr = subStr;
                        }
                    }
                }

            }
        }

        System.out.println(longestStr);

    }
}