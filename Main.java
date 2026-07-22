class Node{
        int data;
        Node next;
        Node back;

        Node(int data1,Node next1,Node back1){
            this.data=data1;
            this.next=next1;
            this.back=back1;
        }

        Node(int data1){
            this.data=data1;
            this.next=null;
            this.back=null;
        }
    }
public class Main{
    public static Node convertToDLL(int[] arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<=arr.length-1;i++){
            Node temp=new Node(arr[i]);
            prev.next=temp;
            temp.back=prev;
            prev=prev.next;
        }
        return head;
    }

    public static void Print(Node head){
        Node temp=head;
        System.out.println(temp.data);
        while(temp !=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }


    public static void main(String[] args){
        int[] arr={2,5,8,6,10};
        Node head=convertToDLL(arr);
        Print(head);
    }
}
    
