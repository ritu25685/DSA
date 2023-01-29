public class PalindromeLL{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head== null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        
        
    }
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    public boolean checkPalindrome(){
        if(head==null || head.next == null){
            return true;
        }
        Node mid = getMid(head);
        Node prev = null;
        Node curr = mid;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        prev = head;
        Node left = head;
        Node right = prev;
        while(right!=null){
            if(left.data==right.data){
                return true;
            }
            left = left.next;
            right = right.next;
        }
        return false;
    }
    public static void main(String[] args){
        PalindromeLL pl = new PalindromeLL();
        pl.addFirst(5);
        pl.addFirst(4);
        pl.addFirst(3);
        pl.addFirst(2);
        pl.addFirst(1);
        pl.print();
        System.out.println(pl.checkPalindrome());

    }
}