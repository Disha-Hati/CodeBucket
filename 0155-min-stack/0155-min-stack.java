class MinStack {
   private long minEle;
    private Stack<Long> s;

    public MinStack() {
        s = new Stack<>();
    }

    public void push(int val) {
        long value = val;
        if (s.isEmpty()) {
            s.push(value);
            minEle = value;
        } else {
            if (value >= minEle) {
                s.push(value);
            } else {
                s.push(2 * value - minEle);
                minEle = value;
            }
        }
    }

    public void pop() {
        if (s.isEmpty()) return;
        long top = s.pop();
        if (top < minEle) {
            minEle = 2 * minEle - top;
        }
    }

    public int top() {
        if (s.isEmpty()) return -1;
        long top = s.peek();
        if (top < minEle) {
            return (int) minEle;
        }
        return (int) top;
    }

    public int getMin() {
        if (s.isEmpty()) return -1;
        return (int) minEle;
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