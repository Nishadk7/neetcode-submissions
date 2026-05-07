class Solution {
    public int characterReplacement(String s, int k) {
        String p = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int res = 0;

        for (char c : p.toCharArray()) {
            int l = 0;
            int nonC = 0;

            for (int r = 0; r < s.length(); r++) {
                if (s.charAt(r) != c) nonC++;

                while (nonC > k) {
                    if (s.charAt(l) != c) nonC--;
                    l++;
                }

                res = Math.max(res, r - l + 1);
            }
        }

        return res;
    }
}
