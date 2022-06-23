//https://leetcode.com/problems/implement-queue-using-stacks/

class MyQueue {
    Stack<Integer>input = new Stack<>();
    Stack<Integer>output = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(output.empty())
        {
            while(input.empty()==false)
            {
                output.push(input.peek());
                input.pop();
            }
        }
        int x = output.peek();
        output.pop();
        return x;
    }
    
    public int peek() {
        if(output.empty())
        {
            while(input.empty()==false)
            {
                output.push(input.peek());
                input.pop();
            }
        }
        return output.peek();
    }
    
    public boolean empty() {
        if(input.size()==0 && output.size()==0)
            return true;
        return false;
    }
}
