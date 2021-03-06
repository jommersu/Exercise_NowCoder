/*
包含min函数的栈
定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */

import java.util.Stack;

public class getMinStack {

    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> helpStack = new Stack<>();

    public void push(int node) {
        dataStack.push(node);
        if(helpStack.isEmpty() || node <= helpStack.peek()){
            helpStack.push(node);
        }
    }

    public void pop() {
        int cur = dataStack.pop();
        if(cur <= helpStack.peek()){
            helpStack.pop();
        }
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return helpStack.peek();
    }
}