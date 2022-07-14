class Solution {
    public boolean isAnagram(String s, String t) {
         Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i = 0; i<s.length(); i++){
            char s1 = s.charAt(i);
            map1.put(s1, map1.getOrDefault(s1, 0)+1);
        }
        for(int i = 0; i<t.length(); i++){
            char t1 = t.charAt(i);
            map2.put(t1, map2.getOrDefault(t1, 0)+1);
        }
        
        return map1.equals(map2);
}
}