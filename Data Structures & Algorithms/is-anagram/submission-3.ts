class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {
        const anagram = new Map<string, number>;

        for (let i = 0; i < s.length; i++){
            anagram.set(s[i], (anagram.get(s[i]) ?? 0) + 1);
        }

        for (let i = 0; i < t.length; i++) {
            anagram.set(t[i], (anagram.get(t[i]) ?? 0) - 1);
        }

        for (const count of anagram.values()) {
            if (count !== 0)  return false;
        }
        return true;
        
    }
}
