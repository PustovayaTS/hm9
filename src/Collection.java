import java.util.HashMap;
import java.util.Map;

public class Collection {
    private Map<Integer, String> collection = new HashMap<>();

    public void addMap(Integer num, String str){
        collection.put(num,str);
    }

    @Override
    public String toString() {
        String str = new String();
        for (Map.Entry<Integer, String> entry: collection.entrySet()) {
            str = str + entry.getKey() + ':' + entry.getValue() + '\n';
        }
        return str;
    }
}
