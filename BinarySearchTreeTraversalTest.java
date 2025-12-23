package bst;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTreeTraversalTest {

    private BinarySearchTree<Integer> buildExampleTree() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        // Creates a reasonably shaped tree
        for (int value : new int[]{34, 12, 50, 8, 20, 40, 60}) {
            bst.insert(value);
        }
        return bst;
    }

    @Test
    void testInorderRecursiveSortedOrder() {
        BinarySearchTree<Integer> bst = buildExampleTree();
        List<Integer> result = bst.inorderRecursive();
        assertEquals(List.of(8, 12, 20, 34, 40, 50, 60), result);
    }

    @Test
    void testPreorderRecursive() {
        BinarySearchTree<Integer> bst = buildExampleTree();
        List<Integer> result = bst.preorderRecursive();
        // expected order depends on insert order and structure
        assertEquals(List.of(34, 12, 8, 20, 50, 40, 60), result);
    }

    @Test
    void testPostorderRecursive() {
        BinarySearchTree<Integer> bst = buildExampleTree();
        List<Integer> result = bst.postorderRecursive();
        assertEquals(List.of(8, 20, 12, 40, 60, 50, 34), result);
    }

    @Test
    void testLevelOrder() {
        BinarySearchTree<Integer> bst = buildExampleTree();
        List<Integer> result = bst.levelOrder();
        assertEquals(List.of(34, 12, 50, 8, 20, 40, 60), result);
    }

    @Test
    void testGetByTraversal() {
        BinarySearchTree<Integer> bst = buildExampleTree();

        assertEquals(
                bst.preorderRecursive(),
                bst.getByTraversal(TraversalType.PREORDER)
        );
        assertEquals(
                bst.inorderRecursive(),
                bst.getByTraversal(TraversalType.INORDER)
        );
        assertEquals(
                bst.postorderRecursive(),
                bst.getByTraversal(TraversalType.POSTORDER)
        );
        assertEquals(
                bst.levelOrder(),
                bst.getByTraversal(TraversalType.LEVEL_ORDER)
        );
    }

    @Test
    void testIterativePreorderMatchesRecursive() {
        BinarySearchTree<Integer> bst = buildExampleTree();
        List<Integer> rec = bst.preorderRecursive();
        List<Integer> iter = TraversalExercises.preorderIterative(bst.getRoot());
        assertEquals(rec, iter);
    }

    @Test
    void testIterativeInorderMatchesRecursive() {
        BinarySearchTree<Integer> bst = buildExampleTree();
        List<Integer> rec = bst.inorderRecursive();
        List<Integer> iter = TraversalExercises.inorderIterative(bst.getRoot());
        assertEquals(rec, iter);
    }

    @Test
    void testLevelOrderUsingQueueMatchesLevelOrder() {
        BinarySearchTree<Integer> bst = buildExampleTree();
        List<Integer> rec = bst.levelOrder();
        List<Integer> iter = TraversalExercises.levelOrderUsingQueue(bst.getRoot());
        assertEquals(rec, iter);
    }
}
