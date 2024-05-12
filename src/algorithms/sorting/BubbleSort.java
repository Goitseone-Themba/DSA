package algorithms.sorting;/**@author: Goitseone Themba 21000539
*/

public class BubbleSort {

    public static void bubblesort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length; j++){
                if(arr[j] < arr[j - 1]) {
                    //swap them
                    int sto = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = sto;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        bubblesort(arr);

        for(int i: arr) {
            System.out.print(i);
        }
    }
}
