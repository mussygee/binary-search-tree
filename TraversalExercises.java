package bst;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraversalExercises {
    // Iterative preorder using a stack
    public static <T extends Comparable<T>> List<T> preorderIterative(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        // TODO: implement iterative preorder using Deque as a stack
        // Hint: push root; while stack not empty:
        //   pop node, visit it, then push right child, then left child
        if (root == null) return result;

        Deque<TreeNode<T>> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode<T> current = stack.pop();
            result.add(current.value);

            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) stack.push(current.left);
            }
            return result;
        }

        // Iterative inorder using a stack
        public static <T extends Comparable<T>>List<T> inorderIterative (TreeNode < T > root) {
            List<T> result = new ArrayList<>();
            Deque<TreeNode<T>> stack = new ArrayDeque<>();
            TreeNode<T> curr = root;

            while (curr != null || !stack.isEmpty()) {
                while (curr != null) {
                    stack.push(curr);
                    curr = curr.left;
                }

                TreeNode<T> node = stack.pop();
                result.add(node.value);
                curr = node.right;
            }

            return result;
        }


        // Optional / challenge: iterative postorder
        public static <T extends Comparable<T>>List<T> postorderIterative (TreeNode < T > root) {
            List<T> result = new ArrayList<>();
            // TODO (challenge): implement iterative postorder
            // You may use two stacks, or one stack with a previous-node pointer.

            if (root == null) return result;

            Deque<TreeNode<T>> stack = new ArrayDeque<>();
            TreeNode<T> curr = root;
            TreeNode<T> lastVisited = null;

            while (curr != null || !stack.isEmpty()) {
                if (curr != null) {
                    stack.push(curr);
                    curr = curr.left;
                } else {
                    TreeNode<T> peek = stack.peek();
                    if (peek.right != null && lastVisited != peek.right) {
                        curr = peek.right;
                    } else {
                        stack.pop();
                        result.add(peek.value);
                        lastVisited = peek;
                    }
                }
            }
            return result;
        }

        // Practice version of level-order
        public static <T extends Comparable<T>>List<T> levelOrderUsingQueue (TreeNode < T > root) {
            List<T> result = new ArrayList<>();
            // TODO: implement BFS using a Queue<TreeNode<T>>

            if (root == null) {
                return result;
            }
            Queue<TreeNode<T>> queue = new ArrayDeque<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode<T> node = queue.remove();
                result.add(node.value);

                if (node.left != null) queue.add(node.left);

                if (node.right != null) queue.add(node.right);
            }
            return result;
        }
    }

