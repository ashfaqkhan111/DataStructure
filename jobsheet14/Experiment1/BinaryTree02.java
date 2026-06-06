package jobsheet14.Experiment1;

import jobsheet12.Assignment.Node;

public class BinaryTree02 {
    Node02 root;

    public BinaryTree02(){
        root = null;
    }

    boolean isEmpty(){
        return root == null;
    }

public void add(Student02 data){
    if(isEmpty()){
        root = new Node02(data);
    }else{
        Node02 currNode = root;
        while(true){
            if(data.gpa < currNode.data.gpa){
                if(currNode.left != null){
                    currNode = currNode.left;
                }else{
                    currNode.left=new Node02(data);
                    break;
                }}else if(data.gpa > currNode.data.gpa){
                    if(currNode.right != null){
                        currNode = currNode.right;
                    }else{
                        currNode.right = new Node02(data);
                        break;
                    }
                }else{
                    break;
                }
            }
        }
    }

public boolean find(double gpa){
    boolean result = false;
    Node02 currNode = root;
    while(currNode != null){
        if(currNode.data.gpa == gpa){
            result = true;
            break;
        }else if(gpa < currNode.data.gpa){
            currNode = currNode.left;
        }else{
            currNode = currNode.right;
        }
    }
    return result;
  }

public void traversePreOrder(Node02 node){
    if(node != null){
        node.data.print();
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
}

public void traverseInOrder(Node02 node){
    if(node != null){
        traverseInOrder(node.left);
        node.data.print();
        traverseInOrder(node.right);
    }
}

public void traversePostOrder (Node02 node){
    if(node != null){
        traverseInOrder(node.left);
        traverseInOrder(node.right);
        node.data.print();
    }
}

public Node02 getSuccessor(Node02 del){
    Node02 successor = del.right;
    Node02 successorParant = del;
    while(successor.left != null){
        successorParant = successor;
        successor = successor.left;
    }
    if(successor != del.right){
        successorParant.left = successor.right;
        successor.right = del.right;
    }
    return successor;
}

public void delete(double gpa){
    if(isEmpty()){
        System.out.println("Tree is Empty!");
        return;
    }
    Node02 parant = root;
    Node02 currNode = root;
    boolean isLeftChild = false;
    while(currNode.data.gpa != gpa){
        parant = currNode;
        if(gpa < currNode.data.gpa){
            isLeftChild = true;
            currNode = currNode.left;
        }
        else{
            isLeftChild = false;
            currNode = currNode.right;
        }
        if (currNode == null){
            System.out.println("couldnt find data!");
            return;
        }
    }

    if(currNode.left == null && currNode.right==null){
        if(currNode == root){
            root = null;
        }else if(isLeftChild){
            parant.left=null;
        }else{
            parant.right = null;
        }
    }else if(currNode.right == null){
        if (currNode == root){
            root = currNode.left;

        }else if(isLeftChild){
            parant.left = currNode.left;
        }else{
            parant.right = currNode.left;
        }
    }else if(currNode.left == null){
        if(currNode == root){
            root = currNode.right;
        }else if(isLeftChild){
            parant.left = currNode.right;
        }else if(isLeftChild){
            parant.left = currNode.right;
        }else{
            parant.right = currNode.right;
        }
    }else{
        Node02 successor = getSuccessor(currNode);
        if(currNode==root){
            root = successor;
        }else if(isLeftChild){
            parant.left = successor;
        }else{
            parant.right = successor;
        }
        successor.left = currNode.left;
    }
}
}
