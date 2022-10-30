package com.dsa.init;

import com.dsa.init.trees.BinaryTree;
import com.dsa.init.trees.BinaryTreeNode;
import com.dsa.init.trees.IdenticalTrees;
import com.dsa.init.trees.InorderIterative2;
import com.dsa.init.trees.InorderIterator;
import com.dsa.init.trees.InorderSuccessorBST;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.*;

@SpringBootTest
@Slf4j
public class TreeTests {

    /**
     * Tree tests
     *
     *
     */
    @Test
    void testTreesIdentical(){
        List<Integer> list1 = List.of(100, 50, 200, 25, 125,350);
        List<Integer> list2 = List.of(4,2,6,1,5,7);
        List<Integer> list3 = List.of(100, 25, 200, 50, 125,350);
        List<Integer> list4 = List.of(100, 50, 200, 25, 125,350);

        BinaryTree tree1 = new BinaryTree(list1);
        BinaryTree tree2 = new BinaryTree(list2);
        BinaryTree tree3 = new BinaryTree(list3);
        BinaryTree tree4 = new BinaryTree(list4);

        boolean result1 = IdenticalTrees.areIdentical(tree1.root, tree2.root);
        log.info(result1 + " <---");

        boolean result2 = IdenticalTrees.areIdentical(tree1.root, tree4.root);
        log.info(result2 + " <---");
    }

    @Test
    void testInorderIterator(){
        List<Integer> list1 = List.of(100, 50, 200, 25, 125,350, 15, 12, 18);
        BinaryTree tree1 = new BinaryTree(list1);
        InorderIterator iter = new InorderIterator(tree1.root);
            String result = "";
        while (iter.hasNext()) {
            result += iter.getNext().data;
            if (iter.hasNext()) {
                result += " ";
            }
        }
        log.info(result);
    }

    @Test
    void testInorderIterator2(){
// Creating a binary tree
        List<Integer> input1 = new ArrayList<Integer>();
        input1.add(100);
        input1.add(50);
        input1.add(200);
        input1.add(25);
        input1.add(75);
        input1.add(125);
        input1.add(300);
        input1.add(12);
        input1.add(35);
        input1.add(60);
        BinaryTree tree1 = new BinaryTree(input1);

        // Creating a right degenerate binary tree
        List<Integer> input2 = new ArrayList<Integer>();
        input2.add(100);
        input2.add(50);
        input2.add(200);
        input2.add(25);
        input2.add(75);
        input2.add(125);
        input2.add(300);
        input2.add(12);
        input2.add(35);
        input2.add(60);
        Collections.sort(input2);
        BinaryTree tree2 = new BinaryTree(input2);

        // Creating a left degenerate binary tree
        List<Integer> input3 = new ArrayList<Integer>();
        input3.add(100);
        input3.add(50);
        input3.add(200);
        input3.add(25);
        input3.add(75);
        input3.add(125);
        input3.add(300);
        input3.add(12);
        input3.add(35);
        input3.add(60);
        Collections.sort(input3, Collections.reverseOrder());
        BinaryTree tree3 = new BinaryTree(input3);

        // Creating a single node binary tree
        BinaryTree tree4 = new BinaryTree(100);

        log.info("<---------- 1 ---------->");
        InorderIterative2.iterativeInorder(tree1.root);
        log.info("<---------- 2 ---------->");
        InorderIterative2.iterativeInorder(tree2.root);
        log.info("<---------- 3 ---------->");
        InorderIterative2.iterativeInorder(tree3.root);
        log.info("<---------- 4 ---------->");
        InorderIterative2.iterativeInorder(tree4.root);
    }


    @Test
    void testInorderSuccessor(){
// Creating a binary tree
        List<Integer> input1 = new ArrayList<Integer>();
        input1.add(100);
        input1.add(50);
        input1.add(200);
        input1.add(25);
        input1.add(75);
        input1.add(125);
        input1.add(300);
        input1.add(12);
        input1.add(35);
        input1.add(60);
        input1.add(55);
        BinaryTree tree1 = new BinaryTree(input1);

        input1.forEach(i ->{
            BinaryTreeNode retVal = InorderSuccessorBST.findInorderSuccessor(tree1.root, i);
            if(retVal != null) {
                log.info(i + " ==> " + retVal.data);
            }
        });
    }

}
