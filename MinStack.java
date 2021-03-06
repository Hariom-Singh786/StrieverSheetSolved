//https://leetcode.com/problems/min-stack/
    class Pair
    {
        int x,y;
        public Pair(int x, int y)
        {
            this.x=x;
            this.y=y;
        }
    }
class MinStack {

    Stack<Pair>st = new Stack<>();

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        int minVal;
        if(st.isEmpty())
        {
            minVal=val;
        }
        else
        {
            minVal = Math.min(st.peek().y,val);
        }
        st.push(new Pair(val,minVal));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().x;
    }
    
    public int getMin() {
       return st.peek().y; 
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
