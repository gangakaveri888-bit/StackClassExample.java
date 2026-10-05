import java.util.Stack;
class StackClassExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
      System.out.println("Stack: " + stack);
       System.out.println("Top element: " + stack.peek());
       System.out.println("Popped element: " + stack.pop());
       System.out.println("Stack after pop: " + stack);
        System.out.println("Position of 20: " + stack.search(20));
    }
}
OUTPUT:
Stack: [10, 20, 30, 40]
Top element: 40
Popped element: 40
Stack after pop: [10, 20, 30]
Position of 20: 2
