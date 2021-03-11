/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting;

/**
 *
 * @author WOCHIENG1
 */
public class ListInsertion {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur = head.next;
        int max = head.val;
        ListNode prev = head;
        while(cur!= null){
            if(cur.val < max){
                prev.next = cur.next;
                cur.next = null;
                head = insert(head, cur);
                cur = prev.next;
            }
            else{
                max = cur.val;
                prev =cur;
                cur= cur.next;
            }
        }
        return head;
    }
    private ListNode insert(ListNode head, ListNode node){
        if(head.val >= node.val){
            node.next = head;
            return node;
        }
        ListNode cur = head;
        while(cur.next != null){
            if(cur.next.val >= node.val){
                node.next = cur.next;
                cur.next = node;
                return head;
            }
            cur =cur.next;
        }
        cur.next = node;
        return head;
    }
}
