package com.edu.org;

class Node {

    int data;

    Node left, right;



    public Node(int data) {

          this.data = data;

          left = right = null;

    }

}



public class Tree {

    Node root;



    Tree(int data) {

          root = new Node(data);

    }



    Tree() {

          root = null;

    }



    /**

    * This method is used to check whether a given element exist in the tree

    *

    * @param root

    * @param x

    * @return

    */

    public static boolean isPresent(Node root, int x) {

          if (root != null) {

                if (root.data == x) {

                      return true;

                } else {

                      return isPresent(root.left, x) || isPresent(root.right, x);

                }

          }

          return false;

    }



    boolean search(int x) {

          return isPresent(root, x);

    }



    /**

    * This method is used to print the pre order traversal

    * @param node

    */

    public void printPreorder(Node node) {

          if (node == null)

                return;

          System.out.print(node.data + " ");

          printPreorder(node.left);

          printPreorder(node.right);

    }



    public void printPreorder() {

          printPreorder(root);

    }



    public static void main(String[] args) {

          Tree tree = new Tree();

          tree.root = new Node(2);

          tree.root.left = new Node(7);

          tree.root.right = new Node(5);

          tree.root.left.left = new Node(2);

          tree.root.left.right = new Node(6);

          tree.root.left.right.left = new Node(5);

          tree.root.left.right.right = new Node(11);

          tree.root.right.right = new Node(9);

          tree.root.right.right.left = new Node(4);

          tree.printPreorder();

          System.out.println(tree.search(9));

    }

}
