package lab.MapandSet;//@author: Goitseone Themba 21000539

import java.util.HashSet;
import java.util.Set;

public class MySet<T> {
    private Set<T> set;

    public MySet() {
        set = new HashSet<>();
    }

    public void add(T element) {
        set.add(element);
    }

    public void remove(T element) {
        set.remove(element);
    }

    public boolean contains(T element) {
        return set.contains(element);
    }

    public int size() {
        return set.size();
    }

    public void printSet() {
        System.out.println("Set: " + set);
    }

    public static void main(String[] args) {
        MySet<Integer> mySet = new MySet<>();

        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(2);

        mySet.printSet();

        System.out.println("Contains 2? " + mySet.contains(2));
        System.out.println("Contains 4? " + mySet.contains(4));

        mySet.remove(2);
        mySet.printSet();

        System.out.println("Size of the set: " + mySet.size());
    }
}
