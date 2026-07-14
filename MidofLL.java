import java.util.*;

class MidofLL {
    int getMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        int cnt = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            cnt++;
        }
        return slow.data;
    }
}
