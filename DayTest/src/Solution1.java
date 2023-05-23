
class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int no1 = 0;
        int no2 = 0;
        int i = 0;
        no1 = getNum(l1, no1, i);
        i=0;
        no2 = getNum(l2, no2, i);
        int sum = no1+no2;
        if (sum<10){
            return new ListNode(sum);
        }
        ListNode listNode = new ListNode(sum%10);
        sum = sum/10;
        ListNode listNode1 = new ListNode(0,listNode);
        while(sum >= 10){
            ListNode l = new ListNode(sum%10);
            listNode.next = l;
            listNode = l;
            sum= sum/10;
        }
        listNode.next = new ListNode(sum);
        listNode = listNode1.next;

        return listNode;
    }

    private int getNum(ListNode l1, int no1, int i) {
        while(l1 != null){
            int tmp = l1.val;
            for (int j = 0; j < i; j++) {
                tmp = tmp*10;
            }
            no1 = no1+tmp;
            i++;
            l1 = l1.next;
        }
        return no1;
    }
}