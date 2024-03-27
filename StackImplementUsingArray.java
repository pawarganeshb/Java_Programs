import java.util.Stack;

class StackImplementUsingArray {
    int a[] = new int[10];
    int top = 0;

    private boolean push(int x) {
        top++;
        a[top] = x;
        System.out.println("Element pushed in the stack: " + x);
        return true;
    }

    private int pop() {
        int x = a[top--];
        System.out.println("Element popped from stack: " + x);
        return x;
    }

    private int peek() {

        return a[top];
    }

    public static void main(String[] args) {
        StackImplementUsingArray s = new StackImplementUsingArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(73);
        s.pop();

        System.out.println("Your topmost Element: " + s.peek());
    }
}