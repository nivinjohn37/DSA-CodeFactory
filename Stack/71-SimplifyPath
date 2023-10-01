class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] pathArr = path.split("/");
        String output = "";
        for(String pathItem : pathArr){
            if("..".equals(pathItem)){
                if(!st.isEmpty()){
                    st.pop();
                }                
            }else if(".".equals(pathItem)){
                continue;
            }else if(pathItem.length()!=0){
                st.push(pathItem);
            }
        }
        while(!st.isEmpty()){
            output = "/" + st.peek() + output;
            st.pop();
        } 
        return output.length() == 0 ? "/":output;
    }
}