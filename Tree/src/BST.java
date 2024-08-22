import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



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

            System.out.println("preorder");
            B.traverse(B.root);
            System.out.println("inorder");
            B.inorder(B.root);
            System.out.println("postorder");
            B.postorder(B.root);
            System.out.println("BFS order");
            B.BFS(B.root);
            System.out.println("DFS order");
            B.DFS(B.root);



        }
        void traverse(Node node){
            if(node != null){
                System.out.println(node.key);
                traverse(node.lchild );
                traverse(node.rchild);

            }

        }



    void inorder(Node node) {

        if (node != null) {


            traverse(node.lchild);
            System.out.println(node.key);

            traverse(node.rchild);


        }


    }

    void postorder(Node node) {
        if (node != null) {


            traverse(node.lchild);


            traverse(node.rchild);
            System.out.println(node.key);

        }
    }

    public void insert(Node node,int key){
        if(this.root == null){
            Node newNode = new Node(key);
            this.root = newNode;

        }
        else {
            if(key < node.key){
                if(node.lchild==null){
                    Node newNode=new Node(key);
                    node.lchild=newNode;

                }
                else {
                    insert(node.lchild,key);
                }
            }
            else {
                if(node.rchild ==  null) {
                    Node newNode = new Node(key);
                    node.rchild = newNode;
                }
                else {
                    insert(node.rchild,key);
                }
            }
        }
    }
    public void BFS(Node node){
        Queue<Node> q = new LinkedList<>();


        q.add(node);

        while (!q.isEmpty()){
            Node current = q.poll();


            System.out.println(current.key);

            if(current.lchild != null){
                q.add(current.lchild);
            }
            if(current.rchild != null){
                q.add(current.rchild);
            }
        }
    }
    public void DFS(Node node) {


        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.println(current.key);


            if (current.rchild != null) {
                stack.push(current.rchild);
            }
            if (current.lchild != null) {
                stack.push(current.lchild);
            }
        }
    }


}












