import java.util.*;
class Node{
            int data;
            Node next;
            Node head=null;
            void createList(int n)
            {
                Scanner sc=new Scanner(System.in);
                Node tail=null;
                for(int i=0;i<n;i++)
                {
                     Node newNode=new Node();
                     System.out.print("Enter "+(i+1)+" Node: ");
                     int val=sc.nextInt();
                     newNode.data=val;
                     if(head==null)
                     {
                          head=newNode;
                          tail=newNode;
                     }
                     else{
                             tail.next=newNode;
                             tail=newNode;
                     }
                }
            }
            void printList()
            {
                Node temp=head;
                while(temp!=null)
                {
                     System.out.print(temp.data+" ");
                     temp=temp.next;
                }
            }
            void insertAtFirst(int val)
            {
                         Node newNode=new Node();
                         newNode.data=val;
               if(head==null)
               {
                   head=newNode;

               }
               else{
                       newNode.next=head;
                       head=newNode;

               }
            }
}
public class Practise83 {

                         public static void main(String[]abc)
                         {
                             int n;
                             Node list=new Node();
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter the number of nodes to enter");
                             n=sc.nextInt();
                             list.createList(n);
                             list.printList();
                              System.out.println();
                             System.out.println("Enter the value that you want to place at First");
                             int val=sc.nextInt();
                             list.insertAtFirst(val);
                             list.printList();
                             sc.close();

                         }
                         
}
