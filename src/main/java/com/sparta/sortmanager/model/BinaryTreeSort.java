package com.sparta.sortmanager.model;


import java.util.ArrayList;

class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
        left = null;
        right = null;
    }
}

class Tree{
    Node node;
    private ArrayList<Integer> arrayList = null;
    Tree(int value){
        node = new Node(value);
    }
    public Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }
        // Move to the left if passed value is
        // less than the current node
        if(value < node.value){
            node.left = insert(node.left, value);
        }
        // Move to the right if passed value is
        // greater than the current node
        else if(value > node.value){
            node.right = insert(node.right, value);
        }
        return node;
    }
    public int[] createIntArrayFromBST(Tree bTree) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        inOrder(bTree.node);
        return arrayList.stream().mapToInt(i->i).toArray();
    }

    // For traversing in order
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            arrayList.add(node.value);
            inOrder(node.right);
        }
    }


}
public class BinaryTreeSort implements SortChoice{
    private long totalTime;

    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public int[] Sort(int[] unsortArr) {
        long startTime = System.nanoTime();
        long endTime;

        Tree tree = new Tree(unsortArr[0]);
        for (int num: unsortArr){
            tree.insert(tree.node,num);
        }

        int [] SortedArr = tree.createIntArrayFromBST(tree);
        endTime = System.nanoTime();
        setTotalTime(endTime - startTime);
        return SortedArr;
    }



    @Override
    public long SortNanoTime() {
        return getTotalTime();
    }
}