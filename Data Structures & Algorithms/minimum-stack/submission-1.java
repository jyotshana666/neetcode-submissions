class MinStack {
    // Use a list as our stack so we can iterate for getMin
    List<Integer> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        // Scan every element to find the minimum
        int min = stack.get(0);
        for (int val : stack) {
            min = Math.min(min, val);
        }
        return min;
    }
}