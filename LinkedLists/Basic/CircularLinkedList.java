package LinkedLists.Basic;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node newNode = new Node(value);
        if (head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;

    }
    public void display(){
        Node temp = head;
        if (head!=null){
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        while (temp != head);
            System.out.println(" HEAD");
        }

    }
    public void delete(int data){
        if (head == null)
            return;
        if (head.data == data){
            head = head.next;
            tail.next = head;
            return;
        }
        Node temp = head;
        while (temp.next.data!=data)
            temp = temp.next;
        temp.next = temp.next.next;
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
