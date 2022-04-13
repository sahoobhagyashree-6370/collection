package collectionBasic;
import java.util.ArrayList;

public class Solution5 {
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
        integers.add(7);
        integers.add(10);
        System.out.println("printing list");
        System.out.println(integers);
        int evenCount = 0;

        for (Integer integer : integers) {
            if(integer.intValue() % 2 ==0){
                evenCount++;
            }
        }
        int oddCount = integers.size()  - evenCount;
        System.out.println("odd count =  " + oddCount);
    }}
