package com.example.demo.trees;

public class BinaryTreeApp {

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public BinaryTreeApp(TreeNode root) {
        this.root = root;
    }

    public void printAll() {
        if (root == null) {
            return;
        }
        print(this.root);
    }

    private void print(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.printf("->" + node.getData());
        print(node.getLeft());
        print(node.getRight());
    }

    public int getHeight() {
        if (this.root == null) {
            return 0;
        }
        return getHeight(this.root);
    }

    public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight()));
    }

    public static void main(String[] args) {
        BinaryTreeApp binaryTreeApp = new BinaryTreeApp(new TreeNode(10));
        binaryTreeApp.getRoot().setLeft(new TreeNode(50));
        binaryTreeApp.getRoot().setRight(new TreeNode(30));
        binaryTreeApp.printAll();
        System.out.println("Height -> " + binaryTreeApp.getHeight());
    }
}
