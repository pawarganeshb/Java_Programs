public class ReversList {
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
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newnode;

    }

    public void revers() {
        if (head == null || head.next == null) {
            return;
        }
        Node preNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = preNode;

            preNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = preNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty...!");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + "-> ");
            curNode = curNode.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReversList list = new ReversList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();

        list.revers();
        list.print();

    }

}
