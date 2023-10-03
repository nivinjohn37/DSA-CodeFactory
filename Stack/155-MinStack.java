public class Elem{
    public int val;
    public int min; 
    public Elem next;
    
    public Elem(int val, int min){
        this.val = val;
        this.min = min;
    }
}
class MinStack {
    public Elem top;

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(top == null){
            top = new Elem(val, val);
        }else{
            Elem e = new Elem(val, Math.min(val, top.min));
            e.next = top;
            top = e;
        }
    }
    
    public void pop() {
        if(top == null){
            return;
        }
        Elem temp = top.next;
        top.next = null;
        top = temp;
    }
    
    public int top() {
        return top == null ? -1 : top.val;
    }
    
    public int getMin() {
        return top == null ? -1 : top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */