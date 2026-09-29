class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BST {

   
    static Node insert(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    
    static void inOrder(Node root) {

        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {

        Node root = null;

        
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);

        System.out.println("===== BINARY SEARCH TREE =====");
        System.out.println();

       
        System.out.println("        50");
        System.out.println("       /  \\");
        System.out.println("     30    70");
        System.out.println("    /  \\  /  \\");
        System.out.println("   20  40 60  80");

        System.out.println();

        
        System.out.print("In-order Traversal: ");
        inOrder(root);

        System.out.println();
        System.out.println();

      
        System.out.println("===== ASCII ART =====");

        System.out.println("    .--.  .--.");
        System.out.println("   :  _ \\/ _  :");
        System.out.println("_\\/ \\ 6    6 /");
        System.out.println("  \\__\\  '   /");
        System.out.println("      \\'--'/");
        System.out.println("      /\\  /\\");
    }
}