package com.atali.dataStructures.trees;

/**
 * Created by atali on 27/06/2016.
 */
public class TreePreorderTraversal {

    /* you only have to complete the function given below. Node is defined as*/

    static class Node {
        int data;
        Node left;
        Node right;
    }


    void preOrder(Node root) {

        StringBuffer buffer = new StringBuffer();

        traverse(buffer, root);

        System.out.println(buffer.toString());
    }

    void traverse(StringBuffer buffer, Node node) {

        buffer.append(node.data + " ");
        if( node.left != null) {
            traverse(buffer, node.left);
        }

        if( node.right != null) {
            traverse(buffer, node.right);
        }
    }
}
