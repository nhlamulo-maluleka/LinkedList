public class Node{
    private int value;
    public Node next;

    Node(int value){
        this.value = value;
        this.next = null;
    }

    public int getValue(){
        return this.value;
    }
}