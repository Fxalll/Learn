package Study;
import java.util.*;

public class S6 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        System.out.println("From Map.keySet to key and value: ");
        for (String key : map.keySet()){
            System.out.println("key = " + key + " and value = " + map.get(key));
        }

        System.out.println("From Map.entrySet use iterator to key and value: ");
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
        }

        System.out.println("From Map.entrySet to key and value: ");
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
        }

        System.out.println("From Map.values() to all the value, can't to key.");
        for (String v : map.values()){
            System.out.println("value = " + v);
        }

    }
}
