package HashMap;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str : strs){
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String temp = new String(strArr);
            if(!map.containsKey(temp)){
                map.put(temp, new ArrayList<String>());
            }
            map.get(temp).add(str);
        }
        result.addAll(map.values());
        return result;
    }
}