package Trien_khai_cac_phuong_thuc_cua_ArrayList;

class MyListArrayListTest {
    public static void main(String[] args) {
        MyListArrayList<Integer> listInteger = new MyListArrayList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(3, 8);
        listInteger.add(4, 10);
        listInteger.add(5, 15);
        listInteger.add(20);
        listInteger.add(25);
        listInteger.remove(3);


        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println("Element " + i + ": " + listInteger.get(i));
        }

//        System.out.println("10 is a Element: " + listInteger.contains(10));
//        System.out.println("11 is a Element: " + listInteger.contains(11));
//        System.out.println("Element " + 1 + ": " + listInteger.indexOf(10));

//        listInteger.clone();
//        for (int i = 0; i < listInteger.size(); i++) {
//            System.out.println("Element " + i + ": " + listInteger.clone());
//
//        }

//        listInteger.clear();
//        System.out.println("10 is a Element: " + listInteger.contains(10));

//        listInteger.ensureCapacity(3);
//        for (int i = 0; i < listInteger.size(); i++) {
//            System.out.println("Element da sua " + i + ": " + listInteger.get(i));
//        }


//        listInteger.clear();
//        for (int i = 0; i < listInteger.size(); i++) {
//            System.out.println("Element da sua " + i + ": " + listInteger.get(i));
//        }

    }
}

