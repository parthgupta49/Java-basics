package LinkedLists.Basic;

public class Linkedlist {

    /*public String toString() {
        return "Linkedlist{" +
                "head=" + this.head.data +
                ", tail=" + this.tail.data +
                ", size=" + this.size +
                '}';
    }*/

    Node head;
    Node tail;
    private int size;

    public Linkedlist() {
        this.size = 0;
    }

    public void insertAtBeginning(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null)
            tail = head;
        size+=1;

    }
    public void insertAtEnd(int value){
        if (tail==null){
            insertAtBeginning(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size+=1;

    }
    public void insertAtRandom(int index,int value){
        if (index==0){insertAtBeginning(value);return;}
        if (index==size){
            insertAtEnd(value);return;
        }

        Node temp = head;
        int i = 1;
        while (i<index){
            temp = temp.next;
            i++;
        }
        temp.next = new Node(value,temp.next);
        size++;
    }
    public void display(){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public int deleteAtFirst(){
        int value = head.data;
        if (size==1){
            head = tail = null;
        }
        head = head.next;
        size--;
        return value;
    }
    public int deleteAtEnd(){
        int data = tail.data;

        Node temp = head;
        while (temp.next.next!=null){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        return data;
    }
    public int deleteAtRandom(int index){
        if (index==0){
            return deleteAtFirst();
        }
        if (index==size-1){
            return deleteAtEnd();
        }
        Node nodePreviousToDelete = get(index-1);
        /*Node nodeToDelete = nodePreviousToDelete.next;
        nodePreviousToDelete.next = nodeToDelete.next;
        return nodeToDelete.data;
        // another way to do this is written below :
        */
        int data = nodePreviousToDelete.next.data;
        nodePreviousToDelete.next = nodePreviousToDelete.next.next;
        return data;
    }
    public Node get(int index){

        Node temp = head;
        int i = 0;
        while (i<index){
            temp = temp.next;
            i++;
        }
        return temp;
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

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}
