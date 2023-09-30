class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(List.of('(','{','[').contains(c)){
                st.push(c);
            }else if(!st.isEmpty() && isMatchingPair(st.peek(), c)){
                st.pop();
            }else{
                return false;
            }
        }
        return st.isEmpty();
    }

    private boolean isMatchingPair(char left, char right){
        return ((left == '(' && right == ')')
            || (left == '{' && right == '}')
            || (left == '[' && right == ']'));
    }
}