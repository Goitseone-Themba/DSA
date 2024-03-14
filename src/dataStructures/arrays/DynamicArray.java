package dataStructures.arrays;

public class DynamicArray {
    private int[] arr;
    private int length;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if(this.length == this.capacity) {
            this.resize();
        }

        this.arr[this.length] = n;
        this.length += 1;
    }

    public int popback() {
        this.length -= 1;
        return this.arr[this.length];
    }

    private void resize() {
        this.capacity = 2 * this.capacity;
        int[] newArr = new int[this.capacity];

        for(int i = 0; i < length; i++) {
            newArr[i] = this.arr[i];
        }

        this.arr = newArr;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}

