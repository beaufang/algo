package com.beau.test;

import com.beau.tree.*;
import org.junit.Test;

public class BinTressTest {

    @Test
    public void test1() {
        Integer[] arr = {3, 4, 5, null, 6, 8, 9, null, null, 9};
        BinTreeNode binTreeNode = BinTreeNode.genTreeByLayer(arr);
        BinTreeLayerTraversal.layerTraversal_1(binTreeNode, new TreePrint());
    }

    @Test
    public void test2() {
        Integer[] arr = {3, 4, 5, null, 6, 8, 9, null, null, 9};
        BinTreeNode binTreeNode = BinTreeNode.genTreeByLayer(arr);
        BinTreePreOrderTraversal.preOrderTraversal_1(binTreeNode, new TreePrint());
    }

    @Test
    public void test2_2() {
        Integer[] arr = {3, 4, 5, null, 6, 8, 9, null, null, 9};
        BinTreeNode binTreeNode = BinTreeNode.genTreeByLayer(arr);
        BinTreePreOrderTraversal.preOrderTraversal_2(binTreeNode, new TreePrint());
    }

    @Test
    public void test3() {
        Integer[] arr = {3, 4, 5, null, 6, 8, 9, null, null, 9};
        BinTreeNode binTreeNode = BinTreeNode.genTreeByLayer(arr);
        BinTreeInOrderTraversal.inOrderTraversal_1(binTreeNode, new TreePrint());
    }

    @Test
    public void test3_2() {
        Integer[] arr = {3, 4, 5, null, 6, 8, 9, null, null, 9};
        BinTreeNode binTreeNode = BinTreeNode.genTreeByLayer(arr);
        BinTreeInOrderTraversal.inOrderTraversal_2(binTreeNode, new TreePrint());
    }

    @Test
    public void test4() {
        Integer[] arr = {3, 4, 5, null, 6, 8, 9, null, null, 9};
        BinTreeNode binTreeNode = BinTreeNode.genTreeByLayer(arr);
        BinTreePostOrderTraversal.postOrderTraversal_1(binTreeNode, new TreePrint());
    }

    @Test
    public void test4_2() {
        Integer[] arr = {3, 4, 5, null, 6, 8, 9, null, null, 9};
        BinTreeNode binTreeNode = BinTreeNode.genTreeByLayer(arr);
        BinTreePostOrderTraversal.postOrderTraversal_2(binTreeNode, new TreePrint());
    }


}
