import java.util.*;
class  Node{
                int data;
                Node next;
                Node head=null;
                void createList(int n)
                {
                    Scanner sc=new Scanner(System.in);
                    Node tail=null;
                    for(int i=0;i<n;i++)
                    {
                         
                         System.out.print("Enter "+(i+1)+" Node: ");
                         Node newNode=new Node();
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
                void insertAtLast(int val)
                {
                     Node newNode=new Node();
                     newNode.data=val;
                     Node temp=head;
                     if(head==null)
                     {
                         head=newNode;
                     }
                     while(temp.next!=null)
                     {
                        temp=temp.next;
                     }
                     temp.next=newNode;
                     temp=newNode;
                }
}
public class Practise84 {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the number of nodes to enter");
                            n=sc.nextInt();
                            Node list=new Node();
                            list.createList(n);
                            list.printList();
                            System.out.println();
                            System.out.println("Enter new Value to insert at Last ");
                            int val=sc.nextInt();
                            list.insertAtLast(val);
                            list.printList();
                            sc.close();
                         }
                         
}
