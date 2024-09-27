
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 ListNode createList(){
     var var1 = new ListNode(1);
     var var2 = new ListNode(2);
     var1.next=var2;
     var var3 = new ListNode(3);
     var2.next = var3;
     var var4 = new ListNode(4);
     var3.next = var4;
     var var5 = new ListNode(5);
     var4.next = var5;
     var var6 = new ListNode(6);
     var5.next = var6;
     var var7 = new ListNode(7,null);
     var6.next = var7;

     print(var1);
     return var1;
 }

 void print(ListNode var1){
     var i = var1;
     while (i != null){
         System.out.print(STR."\{i.val}->");
         i=i.next;
     }
     System.out.println();
 }

////////////////////////////////////////////////////////


ListNode reorderList(ListNode head) {
    if(head.next == null){
        return head;
    }
    ListNode fst = head.next;
    ListNode slw = head;

    //cut down 2 list
    while (fst != null && fst.next != null){
        fst = fst.next.next;
        slw = slw.next;
    }
    ListNode cut = slw.next;
    slw.next = null;

    //reverse 2nd list
    ListNode l = cut;
    ListNode r = cut.next;
    while (l != null && r != null){
         ListNode tmp = r.next;
         r.next = l;
         l = r;
         r = tmp;
    }
    cut.next = null;

    print(head);
    print(l);

    //merge 2 list;
    ListNode f1 = head;
    ListNode f2 = l;

    ListNode ans = new ListNode();
    ListNode trav = ans;
    boolean flip = true;

    while (f1 != null && f2 != null){
        if(flip){
            ListNode tmp1 = f1.next;
            f1.next = null;
            trav.next = f1;
            f1 = tmp1;
            flip = false;
        }else {
            ListNode tmp2 = f2.next;
            f2.next = null;
            trav.next = f2;
            f2 = tmp2;
            flip = true;
        }
        trav = trav.next;
    }
    if (f1 != null){
        trav.next = f1;
    }
    if (f2 != null){
        trav.next = f2;
    };

    return ans.next;
}


void main() {
    var list = createList();
    var h = reorderList(list);
}
