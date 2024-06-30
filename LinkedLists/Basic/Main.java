package LinkedLists.Basic;

public class Main {
    public static void main(String[] args) {
        /*Linkedlist linkedlist = new Linkedlist();
        linkedlist.insertAtBeginning(23);
        linkedlist.insertAtBeginning(3);
        linkedlist.insertAtBeginning(2);
        linkedlist.insertAtEnd(223);

        linkedlist.display();
        linkedlist.insertAtRandom(2,29);
//        linkedlist.display();
        linkedlist.insertAtBeginning(37);
        linkedlist.display();
//        System.out.println(linkedlist.deleteAtFirst()+" got removed");
        System.out.println(linkedlist.deleteAtEnd());
        linkedlist.display();
        System.out.println(linkedlist.deleteAtRandom(3));
        linkedlist.display();
//        System.out.println(linkedlist.head);
//        System.out.println(linkedlist.tail);*/
//        DoublyLinkedlists doublyLinkedlist = new DoublyLinkedlists();
//        doublyLinkedlist.insertAtBeginning(23);
//        doublyLinkedlist.insertAtBeginning(3);
//        doublyLinkedlist.insertAtBeginning(2);
//        doublyLinkedlist.insertAtBeginning(12);
////        doublyLinkedlist.displayReverse();
//        doublyLinkedlist.insertAtLast(344);
//        doublyLinkedlist.display();
//        doublyLinkedlist.insertAtRandom(45,344);
//        doublyLinkedlist.display();

        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insert(23);
        circularLinkedList.insert(231);
        circularLinkedList.insert(3);
        circularLinkedList.insert(2);
        circularLinkedList.display();
        circularLinkedList.delete(231);
        circularLinkedList.display();
        circularLinkedList.delete(23);
        circularLinkedList.display();
    }
}
