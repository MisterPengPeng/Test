package demo;

/*
4. 链表
实现一个保存int数据的链表，使它支持以下7个函数/方法
(1) void push_front(int x)	-- 插入一个新数据到链表头
(2) void push_back(int x)	-- 插入一个新数据到链表尾
(3) int pop_front()			-- 删除链表头处的数据，并将该数据返回
(4) int pop_back()			-- 删除链表尾处的数据，并将该数据返回
(5) int get_front()			-- 返回链表头处的数据；不会修改链表内的任何元素
(6) int get_back()			-- 返回链表尾处的数据；不会修改链表内的任何元素
(7) void print()			-- 从头到尾打印链表中的所有元素，元素间用“,”分隔
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
