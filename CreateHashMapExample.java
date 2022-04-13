package collectionBasic;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

 

public class CreateHashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> numberMapping = new HashMap<>();

 

        // Adding key-value pairs to a HashMap
        numberMapping.put("One", 1);
        numberMapping.put("1", 2);
        numberMapping.put("four", 3);
     // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping.putIfAbsent("four", 4);

 

        System.out.println(numberMapping);
        
        Set<String> keys = numberMapping.keySet();        
        for(String key: keys){
           Integer value = numberMapping.get(key);
           System.out.printf("key: %s, value: %d %n", key, value);
        }

 

    }
}
 
