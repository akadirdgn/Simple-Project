package veriyapilarodev7;

import java.util.ArrayList;

public class Uygulama {

    Node root;

    public Uygulama() {
        root = null;
    }

    Node newNode(int data) {
        root = new Node(data);
        return root;
    }

    Node add(Node root, int data) {
        if (root != null) {
            if (data < root.data) {
                root.left = add(root.left, data);
            } else {
                root.right = add(root.right, data);
            }

        } else {
            root = newNode(data);
        }
        return root;
    }

    Node delete(Node root, int data) {
        Node t1, t2;
        if (root == null) {
            return null;
        }

        if (root.data == data) {
            if (root.left == root.right) {// ikiside nulldur 
                root = null;
                return null;
            } else if (root.left == null) {
                t1 = root.right;
                return t1;
            } else if (root.right == null) {
                t2 = root.left;
                return t2;
            } else {
                t1 = t2 = root.right;

                while (t1.left != null) {
                    t1 = t1.left;
                }

                t1.left = root.left;

                return t2;
            }
        } else {
            if (data < root.data) {
                root.left = delete(root.left, data);
            } else {
                root.right = delete(root.right, data);
            }
        }

        return root;
    }

    public void yazdir() {
        yazdirRecursive(root, " ");
    }

    private void yazdirRecursive(Node current, String indent) {
        if (current != null) {
            System.out.println(indent + current.data);
            yazdirRecursive(current.left, indent + " ");
            yazdirRecursive(current.right, indent + " ");
        }
    }

    public Node search(int data) {
        return searchRecursive(root, data);
    }

    public Node searchRecursive(Node current, int data) {
        if (current == null || current.data == data) {
            return current;
        }
        if (data < current.data) {
            return searchRecursive(current.left, data);
        }
        return searchRecursive(current.right, data);
    }

    public int[][] gecisMatrix() {
        ArrayList<Integer> liste = new ArrayList<>();
        getNodeList(root, liste);

        int[][] matrix = new int[liste.size()][liste.size()];

        fillTransitionMatrix(root, liste, matrix);

        return matrix;
    }

    private void getNodeList(Node current, ArrayList<Integer> liste) {
        if (current != null) {
            getNodeList(current.left, liste);
            liste.add(current.data);
            getNodeList(current.right, liste);
        }
    }

    private void fillTransitionMatrix(Node current, ArrayList<Integer> liste, int[][] matrix) {
        if (current != null) {
            int currentIndex = liste.indexOf(current.data);

            if (current.left != null) {
                int leftIndex = liste.indexOf(current.left.data);
                matrix[currentIndex][leftIndex] = 1;
                fillTransitionMatrix(current.left, liste, matrix);
            }

            if (current.right != null) {
                int rightIndex = liste.indexOf(current.right.data);
                matrix[currentIndex][rightIndex] = 1;
                fillTransitionMatrix(current.right, liste, matrix);
            }
        }
    }

}
