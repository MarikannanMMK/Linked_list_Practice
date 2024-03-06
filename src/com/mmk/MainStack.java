package com.mmk;

public class MainStack {

    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(5);

        stack.push(15);
        stack.push(8);
        stack.push(17);
        stack.push(98);
        stack.push(62);
        stack.push(79);

        stack.display();
    }
}
