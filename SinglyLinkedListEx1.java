import java.util.*;
public class SinglyLinkedListEx1 {
                         Node head=null;
                         static class Node{
                              int data;
                              Node next;
                              Node(int data)
                              {
                                 this.data=data;
                                 this.next=null;
                              }

                         }
  public void insertAtEnd(int value)
  {
     Node newNode=new Node(value);
     if(head==null)
     {
        head=newNode;
        return;
     }
     Node temp=head;
     while(temp.next!=null)
     {
                         temp=temp.next;
     }
     temp.next=newNode;
  }

  public void display()
  {
     Node temp=head;
     if(temp==null)
     {
        System.out.println("List is Empty");
     } 
     System.out.println("List is ");
     while(temp!=null)
     {
            System.out.println(temp.data+" ");
            temp=temp.next;
     }  
  }
  public static void main(String[]abc)
  {
       SinglyLinkedListEx1  list=new SinglyLinkedListEx1();
       list.insertAtEnd(10);
       list.insertAtEnd(200);
       list.insertAtEnd(20);
       list.insertAtEnd(20);  
       list.display();                   
  }
                         
}
