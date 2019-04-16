package demo;

import java.util.Scanner;

public class LinkedListSummation {
	static class Node {
		int realNum;
		int imaginaryNum;
		Node next;
	}
	
	static Node headNode;	
	
	public LinkedListSummation() {
		headNode = null;
	}
	
	//插入
	public void Insert(int index, int realNum, int imaginaryNum) {
		if (index == 0) {
			Node temp = new Node();
			temp.realNum = realNum;
			temp.imaginaryNum = imaginaryNum;
			temp.next = headNode;
			headNode = temp;
		} else {
			Node backUp = headNode;
			for (int i = 1; i < index; i++) {
				if (backUp == null) {
					throw new ArrayIndexOutOfBoundsException(index);
				} else {
					backUp = headNode.next;
				}
			}
			if (backUp == null) {
				throw new ArrayIndexOutOfBoundsException(index);
			}
			Node temp = new Node();
			temp.realNum = realNum;
			temp.imaginaryNum = imaginaryNum;
			temp.next = backUp.next;
			backUp.next = temp;
		}
	}
	
	//删除
	public void Delete(int index) {
		if (index == 0) {
			if (headNode == null) {
				throw new ArrayIndexOutOfBoundsException(index);
			} else {
				headNode = headNode.next;
			}
		} else {
			Node backUp = headNode;
			for (int i = 1; i < index; i++) {
				if (backUp == null) {
					throw new ArrayIndexOutOfBoundsException(index);
				} else {
					backUp = headNode.next;
				}
			}
			if (backUp == null) {
				throw new ArrayIndexOutOfBoundsException(index);
			}
			Node temp = backUp.next;
			backUp.next = temp.next;
		}
	}
	
	//得到实数
	public int GetRealNum(int index) {
		if (index == 0) {
			if (headNode == null) {
				throw new ArrayIndexOutOfBoundsException(index);
			} else {
				return headNode.realNum;
			}
		} else {
			Node backUp = headNode;
			for (int i = 1; i <= index; i++) {
				if (headNode == null) {
					throw new ArrayIndexOutOfBoundsException(index);
				} else {
					backUp = backUp.next;
				}
			}
			if (backUp == null) {
				throw new ArrayIndexOutOfBoundsException(index);
			} else {
				return backUp.realNum;
			}
		}
	}
	
	//得到虚数
	public int GetImaginaryNum(int index) {
		if (index == 0) {
			if (headNode == null) {
				throw new ArrayIndexOutOfBoundsException(index);
			} else {
				return headNode.imaginaryNum;
			}
		} else {
			Node backUp = headNode;
			for (int i = 1; i <= index; i++) {
				if (headNode == null) {
					throw new ArrayIndexOutOfBoundsException(index);
				} else {
					backUp = backUp.next;
				}
			}
			if (backUp == null) {
				throw new ArrayIndexOutOfBoundsException(index);
			} else {
				return backUp.imaginaryNum;
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedListSummation linkedListSummation = new LinkedListSummation();
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			linkedListSummation.Insert(i, scanner.nextInt(), scanner.nextInt());
		}
		
		scanner.close();
		
		int realNum = 0;
		int imaginaryNum = 0;
		for (int i = 0; i < 10; i++) {
			realNum += linkedListSummation.GetRealNum(i);
			imaginaryNum += linkedListSummation.GetImaginaryNum(i);
		}
		
		System.out.println(realNum + "+" + imaginaryNum + "i");
	}
}
