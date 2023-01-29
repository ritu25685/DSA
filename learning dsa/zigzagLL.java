
import java.util.*;
public class zigzagLL {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    public void zigzag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //Reverse second half
        Node prev = null;
        Node curr = mid.next;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //alternate merge
        Node LH = head;
        Node RH = prev;
        Node nextL, nextR;
        while(LH!=null && RH!=null){
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;
            LH = nextL;
            RH = nextR;

        }

    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        zigzagLL zl = new zigzagLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        zl.print();
        zl.zigzag();
        zl.print();




    }
    
}
