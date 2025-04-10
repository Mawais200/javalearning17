class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FindLoop {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        createLoopInCenter(head);

        System.out.println(detectLoop(head) ? "Loop detected in the linked list." : "No loop detected in the linked list.");
    }

    // Function to create a loop in the center of the linked list
    public static void createLoopInCenter(Node head) {
        if (head == null || head.next == null) return;

        Node slow = head, fast = head;

        // Find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Create a loop by connecting the last node to the middle node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = slow; // Loop created
    }

    // Function to detect a loop in the linked list
    public static boolean detectLoop(Node head) {
        Node slow = head, fast = head;

    }

    // Function to detect a loop in the linked list
    public static boolean detectLoop(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Loop detected
            }
        }
        return false; // No loop
    }
}