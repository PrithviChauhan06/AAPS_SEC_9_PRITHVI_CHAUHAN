public class anagram2 {
        public static  boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            int[] freq = new int[256];

            for (char c : s.toCharArray()) {
                freq[c]++;
            }

            for (char c : t.toCharArray()) {
                freq[c]--;
            }

            for (int count : freq) {
                if (count != 0) {
                    return false;
                }
            }

            return true;
        }
        public static void main(String[] args) {
            String s1 = "EAT";
            String s2 = "TEA";
            System.out.println(isAnagram(s1,s2));
        }
}

