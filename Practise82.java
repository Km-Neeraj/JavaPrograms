import java.util.*;
class Node 
{
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
}
public class Practise82 {
                         public static void main(String[]abc)
                         {
                             Node list=new Node();
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter the number Node To enter");
                             int n=sc.nextInt();
                             list.createList(n);
                             list.printList();
                             sc.close();
                         }
                         
}
