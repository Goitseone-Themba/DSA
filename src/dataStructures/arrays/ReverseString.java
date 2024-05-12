package dataStructures.arrays;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author: Goitseone Themba 21000539
 */
public class ReverseString {
    public static String reverse(String st) {
        Stack<Character> wStack = new Stack<>();

        for(char i: st.toCharArray()) {
            wStack.push(i);
        }

        String newSt = "";
        for(int i = 0; i < st.length(); i++) {
            newSt += wStack.pop();
        }

        return newSt;
    }

    public static void main(String[] args) {

        String name = "ThatFireDev";
        String reversed = reverse(name);
        System.out.println(reversed);
    }
}
