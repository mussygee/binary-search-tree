# BST Traversals Lab – GitHub Classroom Assignment

## Overview

In this assignment you will practice **Binary Search Tree (BST)** traversals and deepen your understanding of this ADT.

You will:

- Build a BST by inserting elements.
- Implement **depth-first traversals**:
    - Preorder (Root → Left → Right)
    - Inorder (Left → Root → Right)
    - Postorder (Left → Right → Root)
- Implement **breadth-first (level-order) traversal** using a **queue**.
- Implement **iterative** versions of some traversals using stacks/queues.
- Observe how **insertion order** and **tree shape** affect traversal results.

Unit tests are provided to guide your progress.

---

## Learning Goals

By the end of this assignment, you should be able to:

1. Implement and trace preorder, inorder, postorder, and level-order traversals on a BST.
2. Explain why inorder traversal of a BST yields elements in **sorted order**.
3. Use **recursion** and **iterative** approaches (stack/queue) for tree traversals.
4. Describe how different insertion orders affect BST shape and traversal output.
5. Read and reason about a simple BST ADT in Java.


## Files You Will Work With

All starter code is in src/main/java/bst:

- TreeNode.java
Simple generic tree node class used by the BST. 
- BinarySearchTree.java
Partial implementation of a generic BST. Some methods are already implemented (e.g., insert). Others (traversals) are TODOs for you.

- TraversalType.java
Enum to represent different traversal orders.

- TraversalExercises.java
Extra helper methods where you will implement iterative traversals and small experiments.

Tests are in src/test/java/bst:

- BinarySearchTreeTraversalTest.java
JUnit tests to validate your traversals. Use these tests to check your progress.