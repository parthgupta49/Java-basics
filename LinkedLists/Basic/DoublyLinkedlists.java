package LinkedLists.Basic;

public class DoublyLinkedlists {
    private Node head;
    public void insertAtBeginning(int value){
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public Node find(int value){
        Node temp = head;
        while (temp!=null){
            if (temp.data == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void insertAtRandom(int valueToBeInserted,int valueAfterWhichToBeInserted){

        Node temp = find(valueAfterWhichToBeInserted);
        if (temp==null){
            System.out.println("value does not exist");
            return;
        }
        Node newNode = new Node(valueToBeInserted);
        newNode.next = temp.next;
        if (temp.next!=null){
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;

    }
    public void insertAtLast(int value){
        Node newNode = new Node(value);
        if (head==null) {head = newNode;return;}
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    public void displayReverse(){
        Node temp = head;
        Node last = null;
        while (temp!=null){
            System.out.print(temp.data + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("In reverse : ");
        while (last!=null){
            System.out.print(last.data+" -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
    private class Node{
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
