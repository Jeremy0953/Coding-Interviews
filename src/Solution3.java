import java.util.ArrayList;
import java.util.Stack;

public class Solution3 {
    //逆序输出链表，压栈弹栈
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        if (listNode==null)
            return arrayList;
        else
            stack.push(listNode.val);
        while (listNode.next!=null)
        {
            listNode = listNode.next;
            stack.push(listNode.val);
        }
        while (!stack.empty())
        {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }
}
