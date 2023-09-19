package HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        int map[] = new int[26];
        for(int i =0;i<s.length();i++){
            map[s.charAt(i)-97] = map[s.charAt(i)-97]+1;
        }       
        for(int i =0;i<t.length();i++){
            map[t.charAt(i) -97] = map[t.charAt(i) -97]-1;
            if(map[t.charAt(i) -97] < 0){
                return false;
            }
        }
        System.out.println(Arrays.toString(map));
        for(int i =0;i < 26;i++){
            if(map[i]>0){
                return false;
            }
        }
        /*if(!IntStream.range(0,26).anyMatch(i -> map[i] > 0)){
            return false;
        }*/
        return true;
    }
}

/**Best Solution */

class Solution {
    public boolean isAnagram(String s, String t) {
        int map[] = new int[26];
        s.chars().forEach(ch -> map[ch - 'a']++);
        t.chars().forEach(ch -> {
            map[ch - 'a']--;
            if(map[ch - 'a'] < 0){
                return false;
            }
        });
        return Arrays.stream(map).allMatch(count -> count == 0);
    }
}