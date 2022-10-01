/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder n1 = new StringBuilder();
        StringBuilder n2 = new StringBuilder();
        
        ListNode p = l1;
        ListNode q = l2;
        while(p!=null)
        {
            n1.append(Integer.toString(p.val));
            p = p.next;
        }
        
        while(q!=null)
        {
            n2.append(Integer.toString(q.val));
            q = q.next;
            
        }
        
        // n1.reverse();
        // n2.reverse();
        
        int i = n1.length();
        int j = n2.length();
        StringBuilder res = new StringBuilder();
        int carry=0;
        int sum=0;
        int number = 0;
        while(i>0 && j>0)
        {
            sum = (n1.charAt(n1.length()-i)-48) + (n2.charAt(n2.length()-j)-48)+carry;
            carry = sum/10;
            number = sum%10;
            res.append(Integer.toString(number));
            
            
            i--;
            j--;
        }
        
        
        
        if(i>0){
            while(i>0){
                sum = carry+(n1.charAt(n1.length()-i)-48);
                carry = sum/10;
                number = sum%10;
                res.append(Integer.toString(number));
                i--;
            }
        }
        
        if(j>0){
            while(j>0){
                sum = carry+(n2.charAt(n2.length()-j)-48);
                carry = sum/10;
                number = sum%10;
                res.append(Integer.toString(number));
                j--;
            }
        }
        
        if(i==0 && j==0)
        {
            if(carry>0){res.append(Integer.toString(carry));}
        }
        
        
        
        
        ListNode head = new ListNode(res.charAt(0)-48);
        
        ListNode ptr = head;
        for(int l=1; l<res.length(); l++){
            ListNode temp = new ListNode(res.charAt(l)-48);
            ptr.next = temp;
            ptr = ptr.next;
        }
        
        ;
        
        return head;
        
        
    }
}