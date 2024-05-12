//@Author: Goitseone Themba 21000539
package dataStructures.arrays;

///@Author: Goitseone Themba
public class DynamicArray {

    private int length;
    private int capacity;
    private int[] arr;

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

    public void resize() {
        this.capacity = 2 * this.capacity;
        int[] new_arr = new int[this.capacity];

        for(int i = 0; i < this.length; i++) {
            new_arr[i] = this.arr[i];
        }

        this.arr = new_arr;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}

