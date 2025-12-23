package bst;

public class TreeNode<T extends Comparable<T>> {
    T value;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public TreeNode<T> getRight() {
        return right;
    }
}

