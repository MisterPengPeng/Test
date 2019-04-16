package demo;

//import java.util.Scanner;

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
public class Queue {
	static class Node {
		int data;
		Node next;
	}
	
	static Node headNode;
	
	public Queue() {
		headNode = null;
	}
	
//	//插入一个新数据到链表头
//	public void push_front(int x) {
//		Node node = new Node();
//		node.data = x;
//		node.next = headNode;
//		headNode = node;
//	}
	
	//插入一个新数据到链表尾
	public void push(int x) {
		Node temp = new Node();
		temp = headNode;
		if (headNode == null) {
			Node node = new Node();
			node.data = x;
			node.next = null;
			headNode = node;
			return;
		}
		while (true) {
			if (temp.next == null) {
				Node node = new Node();
				node.data = x;
				node.next = null;
				temp.next = node;
				return;
			}
			temp = temp.next;
		}
	}
	
	//删除链表头处的数据, 并将该数据返回
	public int pop() {
		int temp = headNode.data;
		headNode = headNode.next;
		return temp;
	}
	
//	//删除链表尾处的数据, 并将该数据返回
//	public int pop_back() {
//		Node temp = new Node();
//		temp = headNode;
//		while (true) {
//			if (temp.next.next == null) {
//				Node node = new Node();
//				node = temp.next;
//				temp.next = null;
//				return node.data;
//			}
//			temp = temp.next;
//		}
//	}
	
	//返回链表头处的数据, 不会修改链表内的任何元素
	public int get() {
		if (headNode != null) {
			return headNode.data;
		} else {
			throw new NullPointerException();
		}
	}
	
//	//返回链表尾处的数据, 不会修改链表内的任何元素
//	public int get_back() {
//		Node temp = new Node();
//		temp = headNode;
//		while (true) {
//			if (temp.next == null) {
//				return temp.data;
//			}
//			temp = temp.next;
//		}
//	}

	//从头到尾打印链表中的所有元素, 元素间用","分隔
	public void print() {
		Node temp = new Node();
		temp = headNode;
		if (headNode == null) {
			System.out.println();
			return;
		}
		while (true) {
			if (temp.next == null) {
				System.out.println(temp.data);
				return;
			} else {
				System.out.print(temp.data + ", ");
				temp = temp.next;
			}
		}
	}
	
//	//创建一个链表, 长度为length
//	public void createLinkedList() {
//		Scanner scanner = new Scanner(System.in);
//		Stack linked = new Stack();
//		
//		int length = scanner.nextInt();
//		for (int i = 0; i < length; i++) {
//			linked.push_back(scanner.nextInt());
//		}
//		
//		scanner.close();
//	}
}
