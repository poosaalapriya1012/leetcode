class Solution {

    public static boolean isAnagram(HashMap<Character, Integer> mp1, HashMap<Character, Integer> mp2) {
        if (mp1.size() != mp2.size()) {
            return false;
        }
        for (char key : mp1.keySet()) {
            if (!mp2.containsKey(key)) {
                return false;
            }
            int a = mp1.get(key);
            int b = mp2.get(key);

            if (a != b) {
                return false;
            }
        }

        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list1 = new ArrayList<>();
        HashMap<Character, Integer> mp1 = new HashMap<>();
        HashMap<Character, Integer> mp2 = new HashMap<>();

        int k = p.length();

        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            mp2.put(ch, mp2.getOrDefault(ch, 0) + 1);
        }
        
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            char right = s.charAt(r);
            mp1.put(right, mp1.getOrDefault(right, 0) + 1);

            if (r - l + 1 > k) {
                mp1.put(s.charAt(l), mp1.get(s.charAt(l)) - 1);
                if (mp1.get(s.charAt(l)) == 0) {
                    mp1.remove(s.charAt(l));
                }
                l++;
            }

            if (r - l + 1 == k && isAnagram(mp1, mp2))
             {
                    list1.add(l);
                }
        }
        return list1;

    }
}