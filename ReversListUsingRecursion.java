public class ReversListUsingRecursion {
    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newnoNode = new Node(data);
        if (head == null) {
            head = newnoNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newnoNode;
    }

    public Node revers(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = revers(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("list is empty...!");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReversListUsingRecursion list = new ReversListUsingRecursion();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();

        list.head = list.revers(list.head);
        list.print();

    }

}
