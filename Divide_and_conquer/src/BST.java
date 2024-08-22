public class BST {
    Node root;

    public static void main(String[] args) {


        Node n1 = new Node(10);
        Node n2 = new Node(15);
        Node n3 = new Node(5);
        Node n4 = new Node(12);
        Node n5 = new Node(2);
        Node n6 = new Node(8);
        Node n7 = new Node(1);
        Node n8 = new Node(13);
        BST B = new BST();
        B.root = n1;
        n1.lchild = n3;
        n1.rchild = n2;

        n2.lchild = n4;

        n3.lchild = n5;
        n3.rchild = n6;

        n4.rchild= n8;

        n5.lchild =n7;

        B.traverse(B.root);



    }
    void traverse(Node node){
        if(node != null){
            System.out.println(node.key);
            traverse(node.lchild );
            traverse(node.rchild);

        }

        }
    }

