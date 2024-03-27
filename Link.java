public class Link {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private void addfirst(String data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head = newnNode;
            return;
        }
        newnNode.next = head;
        head = newnNode;
    }

    private void addlast(String data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head = newnNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newnNode;
    }

    private void printlist() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;

        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Link list = new Link();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();
        
        list.addlast("list");
        list.printlist();
        
        list.addfirst("this");
        list.printlist();
    }

}