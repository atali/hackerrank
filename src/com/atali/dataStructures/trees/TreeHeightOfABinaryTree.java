package com.atali.dataStructures.trees;

/**
 * Created by atali on 27/06/2016.
 */
public class TreeHeightOfABinaryTree {


    class Node {
       int data;
       Node left;
       Node right;
    }

    int height(Node root)
    {
        return computeHeight(root) -1;
    }

    int computeHeight(Node node) {

        if( node == null) {
            return 0;
        }
        return Math.max( computeHeight(node.left), computeHeight(node.right)) + 1;
    }

}
