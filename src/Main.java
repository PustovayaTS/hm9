import java.util.HashMap;

public class Main {
    static HashMap<String, Integer> collection = new HashMap<>();
    public static void main(String[] args) {

        collection.put("Строка1", 1);
        collection.put("Строка2", 2);
        collection.put("Строка3", 3);

        addStr("Строка4", 2);
        System.out.println(collection);

    }

    public static void addStr(String key,int value){
        if (collection.containsKey(key)) {
            if (collection.get(key) == value){
                throw new RuntimeException();
            } else {
                collection.put(key, value);
            }
        } else {
            collection.put(key, value);
        }
    }
}