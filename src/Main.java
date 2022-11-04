import java.util.*;

public class Main {

    static HashMap<String, List<Integer>> collection = new HashMap<>();

    public static void main(String[] args) {

        collection.put("Str1", fillList());
        collection.put("Str2", fillList());
        collection.put("Str3", fillList());
        collection.put("Str4", fillList());
        collection.put("Str5", fillList());

        System.out.println(collection);

        Map<String, Integer> newCollection = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry: collection.entrySet()) {
            newCollection.put(entry.getKey(), getSum(entry.getValue()));
        }
        System.out.println(newCollection);

    }

    public static List<Integer> fillList() {
        List <Integer> list1 = new ArrayList<>();
        Random r = new Random();
        int x = r.nextInt(1000);
        for (int i = 0; i <= 2; i++) {
            list1.add(x);
            x = r.nextInt(1000);
        }
        return list1;
    }

    public static int getSum(List<Integer> intList){
        int sum = 0;
        for (Integer entry: intList){
            sum = sum + entry;
        }
        return sum;
    }
}