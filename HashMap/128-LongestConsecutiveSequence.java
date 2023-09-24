package HashMap;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        Set<Integer> numSet = new HashSet<Integer>();
        int longest = 1;
        for(int i = 0; i < n ; i++){
            numSet.add(nums[i]);
        }
      
        for(Integer num: numSet){                   
            if(!numSet.contains(num - 1)){ 
                int x = num;
                int count = 1;                
                while(numSet.contains(x+1)){
                    count++;
                    x = x+1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;    
    }
}