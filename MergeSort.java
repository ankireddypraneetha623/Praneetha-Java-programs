public class Singlelinklist {
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        static void traversed() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + "");
            }
            curr = curr.next;
            System.out.println("null");
        }
    }
    public static void main(String[] args){
        head=new Node(1);
        Node second=new Node(3);
        Node third=new Node(3);
        Node fourth=new Node(2);
        head.next=second;
        second.next=third;
        third.next=fourth;
    }
}
