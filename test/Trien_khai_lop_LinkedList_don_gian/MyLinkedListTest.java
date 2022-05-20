package Trien_khai_lop_LinkedList_don_gian;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest  {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(3,9);
        ll.add(14,8);
        ll.printList();

    }

}