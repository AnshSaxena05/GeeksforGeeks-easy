import java.util.Objects;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class gfg_Delete_without_head_pointer {
    void deleteNode(Node del_node) {
        
        if (Objects.nonNull(del_node) && Objects.nonNull(del_node.next)) {
            del_node.data = del_node.next.data;
            del_node.next = del_node.next.next;
        } else {
            del_node = null;
        }
    }

    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        gfg_Delete_without_head_pointer solution = new gfg_Delete_without_head_pointer();

        
        Node toDelete = head.next.next;
        System.out.println("Before deletion:");
        printLinkedList(head);
        solution.deleteNode(toDelete);
        System.out.println("\nAfter deletion:");
        printLinkedList(head);
    }

    private static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
