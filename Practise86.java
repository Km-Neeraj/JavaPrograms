
//insert at first position
import java.util.*;

class Node{
                         int data;
                         Node next;
                         Node head=null;
                         void createList(int n)
                         {
                             Node tail=null;
                             Scanner sc=new Scanner(System.in);
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
                         void insertAtFirst(int val)
                         {
                             Node newNode=new Node();
                             newNode.data=val;
                              newNode.next=head;
                              head=newNode;
                         }
}


public class Practise86 {
                         public static void main(String[]abc)
                         {
                             Node list=new Node();
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter the number of nodes");
                             int n=sc.nextInt();
                             list.createList(n);
                             
                             list.printList();
                             System.out.println();
                             
                             System.out.println("Enter new Node to insert at First");
                             int val=sc.nextInt();
                             list.insertAtFirst(val);
                             list.printList();
                             sc.close();
                         }
                         
}
