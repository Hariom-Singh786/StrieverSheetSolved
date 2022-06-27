
//https://leetcode.com/problems/online-stock-span/

class StockSpanner {
    
    class Pair
    {
        int first;
        int second;
        public Pair(int f, int s)
        {
            this.first=f;
            this.second=s;
        }
    }
    
   Stack<Pair>st = new Stack<>();
    int index;
    public StockSpanner() {
        st = new Stack();
        index= -1;
    }
    
    public int next(int price) {
        index+=1;
        while(!st.isEmpty() && st.peek().second<=price)
        {
            st.pop();
        }
        if(st.isEmpty())
        {
           st.push(new Pair(index,price));
            return index+1;
        }
        int result = st.peek().first;
        st.push(new Pair(index,price));
        return index-result;
    }
}
