import java.util.HashMap;
import java.util.Objects;

public class TelephoneDirectory {
    private HashMap<String, String> directory = new HashMap<>();

    public void addMap(String name,String value){
        directory.put(name, value);
    }

    public HashMap<String, String> getDirectory() {
        return directory;
    }

    public String getValue(String key){
        return directory.get(key);
    }

    @Override
    public String toString() {
        return "TelephoneDirectory{" +
                "directory=" + directory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneDirectory directory1 = (TelephoneDirectory) o;
        return Objects.equals(directory, directory1.directory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directory);
    }
}
