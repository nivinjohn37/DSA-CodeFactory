class Solution {
    public int calculate(String s) {
        int len = s.length();
        int sign = 1;
        int curNum = 0;
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< len; i++){
            if(Character.isDigit(s.charAt(i))){
                curNum = s.charAt(i) - '0';
                while(i+1 < len && Character.isDigit(s.charAt(i+1))){
                    curNum = 10 * curNum + s.charAt(i+1) - '0';
                }
                curNum = sign * curNum;
                ans = ans + curNum;
            }else if(s.charAt(i) == '+'){
                sign = 1;
            }else if(s.charAt(i) == '-'){
                sign = -1;
            }else if(s.charAt(i) == '('){
                stack.add(ans);
                stack.add(sign);
                ans = 0;
                sign = 1;
            }else if(s.charAt(i) == ')'){
                int prevSign = stack.pop();
                int prevAns = stack.pop();
                ans = ans * prevSign;
                ans = ans + prevAns;
            }
        }
        return ans;
    }
}