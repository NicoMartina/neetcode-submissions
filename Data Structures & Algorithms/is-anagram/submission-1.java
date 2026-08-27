class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> anagram = new HashMap<>();

        if ( s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            anagram.put(s.charAt(i), anagram.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            anagram.put(t.charAt(i), anagram.getOrDefault(t.charAt(i),0) - 1);
        }

        for (int count : anagram.values()){
            if (count != 0) return false;
        }
        return true;
    }
}
