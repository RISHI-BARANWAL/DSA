// Intersection of Two Linked Lists

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

// Main code

public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
        int length1 = 0;
        Node current1 = firstHead;
        while (current1 != null) {
            length1++;
            current1 = current1.next;
        }

        int length2 = 0;
        Node current2 = secondHead;
        while (current2 != null) {
            length2++;
            current2 = current2.next;
        }

        // Traverse both linked lists simultaneously
        current1 = firstHead;
        current2 = secondHead;
        while (length1 > 0 && length2 > 0) {
            if (current1 == current2) {
                return current1.data; // Intersection found
            }
            if (length1 > length2) {
                current1 = current1.next;
                length1--;
            } else {
                current2 = current2.next;
                length2--;
            }
        }

        return 0;
    }
}
