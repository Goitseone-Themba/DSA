package Lab2;//@author: Goitseone Themba 21000539
import java.util.List;
import java.util.ArrayList;
public class BinarySearchTree {

    public Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insertRecursive(node.left, data);
        } else if (data > node.data) {
            node.right = insertRecursive(node.right, data);
        } else {
            // If the data is equal to the node's data, increment the count
            node.count++;
        }

        return node;
    }

    //recursive search
    public int search(int data) {
        return searchRecursive(root, data);
    }

    private int searchRecursive(Node node, int data) {
        if (node == null) {
            return 0; // Value not found
        }

        if (data < node.data) {
            return searchRecursive(node.left, data);
        } else if (data > node.data) {
            return searchRecursive(node.right, data);
        } else {
            return node.count; // Return the count of the matching node
        }
    }



    public void delete(int data) {
        root = deleteRecursive(root, data);
    }

    private Node deleteRecursive(Node node, int data) {
        if (node == null) {
            return null;
        }

        if (data < node.data) {
            node.left = deleteRecursive(node.left, data);
        } else if (data > node.data) {
            node.right = deleteRecursive(node.right, data);
        } else {
            // If the data is equal to the node's data
            if (node.count > 1) {
                // If there are multiple instances, decrement the count
                node.count--;
            } else {
                // If there is only one instance, remove the node
                if (node.left == null) {
                    return node.right;
                } else if (node.right == null) {
                    return node.left;
                }

                node.data = minValue(node.right);
                node.right = deleteRecursive(node.right, node.data);
            }
        }

        return node;
    }

    private int minValue(Node node) {
        int minv = node.data;
        while (node.left != null) {
            minv = node.left.data;
            node = node.left;
        }
        return minv;
    }

    public void traverse() {
        List<Node> nodes = new ArrayList<>();
        traverseRecursive(root, nodes);

        // Sort the nodes in descending order of count, and if count is same, sort by value
        nodes.sort((a, b) -> {
            if (b.count != a.count) {
                return b.count - a.count;
            } else {
                return b.data - a.data;
            }
        });

        // Print the nodes
        for (Node node : nodes) {
            for (int i = 0; i < node.count; i++) {
                System.out.print(node.data + " ");
            }
        }
    }

    private void traverseRecursive(Node node, List<Node> nodes) {
        if (node == null) {
            return;
        }

        traverseRecursive(node.left, nodes);
        nodes.add(node);
        traverseRecursive(node.right, nodes);
    }
}
