package collectionBasic;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Solution1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> integers = new ArrayList<>();
        
        integers.add(20);
        
        Integer obj = Integer.valueOf(40);
        integers.add(obj);

        integers.add(20);
        integers.add(40);
        integers.add(50);
        integers.add(60);
        integers.add(50);
        integers.add(3);
        integers.add(26);
        integers.add(10);
        System.out.println("printing list");
        System.out.println(integers);


        HashSet<Integer> integerHashSet = new HashSet<>();

        integerHashSet.add(40);
        integerHashSet.add(1080);
        integerHashSet.add(450);
        integerHashSet.add(190);
        integerHashSet.add(150);
        integerHashSet.add(3500);
        integerHashSet.add(1090);
        integerHashSet.add(110);
        integerHashSet.add(50);
        integerHashSet.add(101);

        

        integerHashSet.addAll(integers);

        System.out.println("set with added list");
        System.out.println(integerHashSet);
        
        Iterator<Integer> itr = integerHashSet.iterator();
        System.out.println(itr.next().getClass());
    }}

        