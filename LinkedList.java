public class LinkedList {
    private Node head;

    LinkedList() {
        head = null;
    }

    public void add(int value) {
        if (head == null)
            head = new Node(value);
        else {
            Node nodeptr = head;
            while (nodeptr.next != null)
                nodeptr = nodeptr.next;
            nodeptr.next = new Node(value);
        }
    }

    public void printlist() {
        Node nodeptr = head;
        while (nodeptr.next != null) {
            System.out.print(nodeptr.getValue() + " -> ");
            nodeptr = nodeptr.next;
        }
        System.out.print(nodeptr.getValue());
    }

    public void shift(int k) {
        Node nodeptr = head;
        Node temp = head;
        int index = 0;

        while (nodeptr != null) {
            if (index == k && index > 0) {
                head = head.next;
                temp.next = nodeptr.next;
                nodeptr.next = temp;
                break;
            }
            nodeptr = nodeptr.next;
            index++;
        }
    }

    public void reverse() {
        Node nodeptr = head;
        Node newHead = null;

        while (nodeptr != null) {
            if (newHead == null) {
                newHead = new Node(nodeptr.getValue());
            } else {
                Node newHeadNode = new Node(nodeptr.getValue());
                newHeadNode.next = newHead;
                newHead = newHeadNode;
            }
            nodeptr = nodeptr.next;
        }
        head = newHead;
    }

    public void stack(int value) {
        if (head == null)
            head = new Node(value);
        else {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }
    }

    public void pop() {
        Node nodeptr = head;
        Node prevptr = null;

        while (nodeptr.next != null) {
            prevptr = nodeptr;
            nodeptr = nodeptr.next;
        }

        if (prevptr == null) head = null;
        else prevptr.next = null;
    }
}
