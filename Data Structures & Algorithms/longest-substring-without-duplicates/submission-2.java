class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> ch = new HashSet<>();

        int i = 0;
        int len = 0;

        for (int j = 0; j < s.length(); j++) {

            char c = s.charAt(j);

            while (ch.contains(c)) {
                ch.remove(s.charAt(i));
                i++;
            }

            ch.add(c);

            len = Math.max(len, j - i + 1);
        }

        return len;
    }
}