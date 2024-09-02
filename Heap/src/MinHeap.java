
import java.util.LinkedList;
import java.util.Queue;

    class MinHeap {
        public Node root;

        public MinHeap() {
            this.root = null;
        }

        public void insert(int value) {
            Node newNode = new Node(value);
            if (root == null) {
                root = newNode;
            } else {
                Queue<Node> queue = new LinkedList<>();
                queue.add(root);

                while (!queue.isEmpty()) {
                    Node current = queue.poll();

                    if (current.left == null) {
                        current.left = newNode;
                        newNode.parent = current;

                        break;
                    } else if (current.right == null) {
                        current.right = newNode; queue.add(current.right);
                        newNode.parent = current;
                        break;
                    } else {
                        queue.add(current.left);
                        queue.add(current.right);
                    }
                }

                heapifyUp(newNode);
            }
        }

        public void heapifyUp(Node node) {
            while (node.parent != null && node.value < node.parent.value) {
                swap(node, node.parent);
                node = node.parent;
            }
        }


        public void swap(Node a, Node b) {
            int temp = a.value;
            a.value = b.value;
            b.value = temp;
        }

        public void printHeap() {
            if (root == null) return;

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node current = queue.poll();
                System.out.print(current.value + " ");

                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
            System.out.println();
        }


      public static void main(String[] args) {
            MinHeap minHeap = new MinHeap();

            minHeap.insert(10);
            minHeap.insert(5);
            minHeap.insert(3);
            minHeap.insert(8);
            minHeap.insert(2);

            System.out.println("Heap elements after insertion:");
            minHeap.printHeap();
        }
    }
