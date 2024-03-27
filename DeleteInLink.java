public class DeleteInLink {
    Node head;
    private int size;

    DeleteInLink() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void insert(int data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head = newnNode;
            return;
        }
        newnNode.next = head;
        head = newnNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("List Is Empty...!");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;

        }
        System.out.println("NULL");
    }

    public void dltfst() {
        if (head == null) {
            System.out.println("List is empty...!");
            return;
        }
        size--;
        head = head.next;
    }

    public void dltlst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondlasNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondlasNode = secondlasNode.next;

        }
        secondlasNode.next = null;

    }

    public static void main(String[] args) {
        DeleteInLink d = new DeleteInLink();

        d.insert(2008);
        d.insert(81);
        d.insert(97);
        d.insert(73);

        d.print();
        d.dltfst();
        d.dltlst();
        d.print();

        // System.out.println(d.size);
        // d.dltlst();
        // d.print();
        // System.out.println(d.size);
    }

}