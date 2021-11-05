package Trees;

import org.jetbrains.annotations.NotNull;

public class BinaryTree {
    Node root;
    public static void main(String args[]) {
        BinaryTree bt = new BinaryTree();
        bt.ins(2);
        bt.ins(3);
        bt.ins(1);
        bt.ins(5);
        bt.ins(7);
        bt.ins(9);
        bt.ins(4);
        bt.ins(9);
        bt.contains(6);
        bt.contains(10);
    }
    private void ins(int value){
        root = insert(root,value);
    }
    private static Node insert(Node curr, int value){
        if( curr == null ){
            return new Node(value);
        }
        if(curr.value > value){
            curr.left = insert(curr.left , value);
        }
        else if(curr.value < value){
            curr.right = insert(curr.right , value);
        }
        return curr;
    }
    private boolean contains(int value){
        return searching(root,value);
    }
    private boolean searching(Node curr,int value){
        if(curr == null){
            return false;
        }
        if(value == curr.value){
            return true;
        }
        return value < curr.value ? searching(curr.left,value) : searching(curr.right,value);
    }
}
