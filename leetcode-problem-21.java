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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr  = new ArrayList<>();
        
        
        ListNode p = list1;
        ListNode q = list2;
        
        if(p==null)return list2;
        if(q==null)return list1;
        
        while(p!=null){
            arr.add(p.val);
            p = p.next;
        }
        
        while(q!=null){
            arr.add(q.val);
            q = q.next;
        }
        
        Collections.sort(arr);
        ListNode res = new ListNode();
        p = res;
        Iterator it = arr.iterator();
        
        for(int n:arr){
            if(res.val ==0){
                res.val = n;
            }
            else{
                ListNode temp = new ListNode();
            temp.val = n;
            p.next = temp;
            p = p.next;    
            }
            
        }
        return res;
        
        
        
    }
}