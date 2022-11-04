import java.util.*;

public class Main {
    public static void main(String[] args) {

        Collection collection = new Collection();

        for (int i = 0; i <= 9; i++) {
            collection.addMap(i, "str" + i);
        }
        System.out.println(collection);

    }
}