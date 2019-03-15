import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hello {
    public static void main(String[] args) {
        Map<Integer, String> firstMap = new HashMap<>();
        firstMap.put(100, "Amy");
        firstMap.put(200, "Bob");
        firstMap.put(300, "Con");
        System.out.println(firstMap);
        System.out.println(firstMap.get(500));
        if(firstMap.containsValue("Con")) {
            System.out.println("Found expected value");
        }

        Set<Integer> code = firstMap.keySet();
        Iterator<Integer> itr = code.iterator();

        while (itr.hasNext()) {
            Integer keyVal = itr.next();
            String value = firstMap.get(keyVal);
            System.out.println("Value here==" + value);
        }
    }


}
