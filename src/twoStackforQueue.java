import java.util.Stack;

/*
用两个栈实现队列
思路：两个栈刚好先进先出，但是一定要满足两个条件：
栈2为空时才才可以压入栈2
栈1出栈压进栈2时必须一次压完
 */
public class twoStackforQueue {
    public static void main(String[] args) {
        int[] array = {2,4,5,6,8};
        /*for (int i = 0; i < array.length; i++) {
            array[i] =  (int) (Math.random() * 10);
        }*/

        StackQueue queue = new StackQueue();
        for (int i = 0; i < array.length; i++){
            queue.push(array[i]);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println(queue.pop());
        queue.push(88);
        System.out.println(queue.pop());

    /*    for (int i = 0; i < array.length; i++){
            System.out.print(queue.pop() + " ");
        }
     */
    }
}

class StackQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node){
        stack1.push(node);
    }
/*
必须满足两个原则：
1、必须在stack2是空的情况下向里push元素
2、每次从stack1出栈，压入stack2，必须全部压完
队列：每次缓存在队列的数据全部pop出去才轮到新进来的数
 */
    public int pop(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }else if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
