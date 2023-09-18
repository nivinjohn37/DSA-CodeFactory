package HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> freq = new HashMap<Character, String>();
        String[] sItems = s.split(" ");
        if(pattern.length() != sItems.length){
            return false;
        }
        
        for(int i = 0; i < pattern.length(); i++){
            char patChar = pattern.charAt(i);
            String item = sItems[i];
            if(freq.containsKey(patChar)){
                String fromMapString = freq.get(patChar);
                if(!item.equals(fromMapString)){
                    return false;
                }
            }else if(!freq.values().contains(item)){
                freq.put(patChar, item);
            }else{
                return false;
            }
        }
        return true;    
    }
}


/**Best Solution*/

public boolean wordPattern(String pattern, String str) {
    String[] words = str.split(" ");
    if (words.length != pattern.length())
        return false;
    Map index = new HashMap();
    for (Integer i=0; i<words.length; ++i)
        if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
            return false;
    return true;
}