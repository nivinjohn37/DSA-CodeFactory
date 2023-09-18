/**
Approach:
- create a frequency arr - either arr or hashmap - to add the frequency.
- check in the frequency array for the char frequency for ransomnote.
- return if the frequency of the character is less than 0.
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] freq = new int[26];
        for(char ch : magazine.toCharArray()){
            freq[ch - 97] += 1;
        }
        for(char ch : ransomNote.toCharArray()){
freq[ch- 97] -= 1;
            if(freq[ch - 97] < 0){
                return false;
            }
        }
        return true;
    }
}