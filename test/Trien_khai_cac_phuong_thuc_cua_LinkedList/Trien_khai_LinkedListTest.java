package Trien_khai_cac_phuong_thuc_cua_LinkedList;




class Trien_khai_LinkedListTest {
    public static void main(String[] args) {
        Trien_khai_LinkedList ll = new Trien_khai_LinkedList(10);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.add(1,2);
        ll.add(1,3);
        ll.add(1,4);
       ll.add(3, 8);
       ll.add(4, 10);
        ll.add(5, 15);
        ll.addLast(20);
        ll.addFirst(25);
        ll.remove(3);


        ll.printList();

//        System.out.println(ll.indexOf(15));
//        System.out.println(ll.contains(10));
//
//
//
//        System.out.println(ll.size());
    }
}