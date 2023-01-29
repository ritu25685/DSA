public class practiceLinkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        public void addfirst(Node head, int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
            }
            newNode.next = head;
            newNode = head;
        }
        public void print(Node head){
            Node temp = head;
            while(temp!=null){
                temp = temp.next;
                System.out.print(temp.data+" ");
            }

        }

    }
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.addfirst(4);

    }
    
    
}
