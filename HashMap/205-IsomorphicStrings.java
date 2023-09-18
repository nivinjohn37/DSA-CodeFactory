package HashMap;

/**
 1. Iterate over the first array and store to the hashmap
 2. During the iteration check if already stored in the hashmap one time
 3. And then decide on the boolean
 4. Optmise to HashSet if that is possible
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> freq = new HashMap<Character, Character>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(freq.containsKey(schar)){
                Character fromMapChar=freq.get(schar);
                if(tchar != fromMapChar){
                    return false;
                }
            }else if(!freq.values().contains(tchar)){
                freq.put(schar, tchar);
            }else{
                return false;
            }
        }
        return true;        
    }
}


/**
 * Best Solution
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {

        int map1[]=new int[200];
        int map2[]=new int[200];

        if(s.length()!=t.length())
            return false;


        for(int i=0;i<s.length();i++)
        {
            if(map1[s.charAt(i)]!=map2[t.charAt(i)])
                return false;

            map1[s.charAt(i)]=i+1;
            map2[t.charAt(i)]=i+1;
        }
        return true;
    }
}