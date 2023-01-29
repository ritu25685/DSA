public class LinkedList {
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
    public static int size=0;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail= newNode;
            return;
        

        }
        newNode.next = head;
        head = newNode;
        size++;

    }
    public void addLast(int data){
        Node newNode  = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        size++;
        tail.next = newNode;
        tail = newNode;
    }
    

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
    
        Node temp = head;
        Node newNode = new Node(data);
        int i=0;

        while(i<idx-1){

            temp = temp.next;
            i++;

        }
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return -1;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i =0;i<size-2;i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int search(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(temp.data==key){
               return i; 
            }
            i++;
            temp = temp.next;
            
        }
        return -1;

    }
    public int recSearch(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        return recSearch(head.next,key);
    }

   
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.add(2,3);
        ll.addLast(4);
        ll.addLast(5);
        //ll.removeFirst();
        //ll.removeLast();
        ll.print();
        
        System.out.println(size);

    }

    
    
}
