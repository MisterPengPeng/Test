package demo;

/*
4. ����
ʵ��һ������int���ݵ�������ʹ��֧������7������/����
(1) void push_front(int x)	-- ����һ�������ݵ�����ͷ
(2) void push_back(int x)	-- ����һ�������ݵ�����β
(3) int pop_front()			-- ɾ������ͷ�������ݣ����������ݷ���
(4) int pop_back()			-- ɾ������β�������ݣ����������ݷ���
(5) int get_front()			-- ��������ͷ�������ݣ������޸������ڵ��κ�Ԫ��
(6) int get_back()			-- ��������β�������ݣ������޸������ڵ��κ�Ԫ��
(7) void print()			-- ��ͷ��β��ӡ�����е�����Ԫ�أ�Ԫ�ؼ��á�,���ָ�
*/
public class StackAndQueueMain {
	public static void main(String[] args) {
		Stack stack = new Stack();
		Queue queue = new Queue();
		
		System.out.println("stack");
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.print();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("\nqueue");
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.print();
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
	}
}