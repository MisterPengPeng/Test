package demo;

//import java.util.Scanner;

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
public class Queue {
	static class Node {
		int data;
		Node next;
	}
	
	static Node headNode;
	
	public Queue() {
		headNode = null;
	}
	
//	//����һ�������ݵ�����ͷ
//	public void push_front(int x) {
//		Node node = new Node();
//		node.data = x;
//		node.next = headNode;
//		headNode = node;
//	}
	
	//����һ�������ݵ�����β
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
	
	//ɾ������ͷ��������, ���������ݷ���
	public int pop() {
		int temp = headNode.data;
		headNode = headNode.next;
		return temp;
	}
	
//	//ɾ������β��������, ���������ݷ���
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
	
	//��������ͷ��������, �����޸������ڵ��κ�Ԫ��
	public int get() {
		if (headNode != null) {
			return headNode.data;
		} else {
			throw new NullPointerException();
		}
	}
	
//	//��������β��������, �����޸������ڵ��κ�Ԫ��
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

	//��ͷ��β��ӡ�����е�����Ԫ��, Ԫ�ؼ���","�ָ�
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
	
//	//����һ������, ����Ϊlength
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