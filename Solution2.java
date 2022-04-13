package collectionBasic;

import java.util.ArrayList;

public class Solution2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        
        integers.add(20);
        
        Integer obj = Integer.valueOf(40);
        integers.add(obj);

        integers.add(60);
        integers.add(70);
        integers.add(50);
        integers.add(30);
        integers.add(250);
        integers.add(3);
        integers.add(2);
        integers.add(10);
        System.out.println("printing list");
        System.out.println(integers);
        int size = integers.size();
        System.out.println("size = " + size);
        int no = integers.get(15);
        System.out.println(no);

    }

}