package lab.MapandSet;//@author: Goitseone Themba 21000539

import java.util.HashMap;
import java.util.Map;

public class MyDictionary {
    private Map<String, String> collection;

    public MyDictionary() {
        collection = new HashMap<>();
    }

    public void add(String word, String Definition) {
        collection.put(word, Definition);
    }

    public String getDef(String word) {
        return collection.get(word);
    }

    public static void main(String[] args) {
        MyDictionary babel = new MyDictionary();

        babel.add("Data Structure", "A data structure is a set of operations that define, store, access and manipulate data");
        babel.add("Algorithm", "An algorithm is a set of instructions designed to perform a specific task.");

        System.out.println(babel.getDef("Data Structure"));
        System.out.println(babel.getDef("Algorithm"));
    }
}

