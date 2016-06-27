package com.atali.dataStructures.trees;

/**
 * Created by atali on 27/06/2016.
 */
public class TreeTopView {


   class Node {
       int data;
       Node left;
       Node right;
   }

    void top_view(Node root)
    {
        StringBuffer buffer = new StringBuffer();
        traverseleft(buffer, root.left);
        buffer.append(root.data + " ");
        traverseright(buffer, root.right);
        System.out.println(buffer.toString());
    }

    void traverseleft(StringBuffer buffer, Node node) {

        if( node.left != null) {
            traverseleft(buffer, node.left);
        }

        buffer.append(node.data + " ");
    }

    void traverseright(StringBuffer buffer, Node node) {

        buffer.append(node.data + " ");
        if( node.right != null) {
            traverseright(buffer, node.right);
        }
    }
}
