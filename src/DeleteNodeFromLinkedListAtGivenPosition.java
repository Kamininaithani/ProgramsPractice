
public class DeleteNodeFromLinkedListAtGivenPosition {
    static Node head;

    public static void main(String[] args) {
        head = new Node(0);
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = first;
        first.next = second;
        third.next = null;
        printNodeList(head);
    }

    public static void printNodeList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.println("Start");
            System.out.println(n.data);
            n = n.next;
        }
    }
}

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
    }
}