//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//
//ListNode createList(int length){
//    if(length==0) return null;
//    if(length==1) return new ListNode(0);
//    var var1 = new ListNode(1);
//    var head = var1;
//    int val = 2;
//    while(length-1 > 0){
//        var1.next = new ListNode(val);
//        var1 = var1.next;
//        val++;
//        length--;
//    }
//    return head;
//}
//
//void print(ListNode var1){
//    var i = var1;
//    while (i != null){
//        System.out.print(STR."\{i.val}->");
//        i=i.next;
//    }
//    System.out.println();
//}
//
//public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//return null;
//}
//
//////////////////////////////////////////////////////////
//void main() {
//    var list = createList(3);
//    var list2 = createList(3);
//    print(list);
//    print(list2);
//
//    print(addTwoNumbers(list, list2));
//}