package failed;

import java.util.Scanner;

/*
���⣺����
С��ʱ�������ֽ����Ϸ��
��һ�ֽ���������������Ϸ������ܼ򵥣�ȴ������С���ѡ�
�����������£�
����μ���Ϸ��С������A��B����Ϸ��ʼ��ʱ�����ǵõ��������ֽ���������£�
A����[K, 8, X, K, A, 2, A, 9, 5, A]
B����[2, 7, K, 5, J, 5, Q, 6, K, 4]
���е�X��ʾ��10�������Ǻ�����ֽ�ƵĻ�ɫ��
��A����ʼ��A��B˫���������ơ�
���ֵ�ĳһ������ʱ�������Լ���ֽ�ƶ��е�ͷ������һ�ţ��ŵ����ϣ�����ѹ��������һ��ֽ���ϣ�����еĻ�����
�����У���Ϸ���̣�
A��K��B��2��A��8��B��7��A��X����ʱ���ϵ�����Ϊ��
K,2,8,7,X
���ֵ�B����ʱ��������K�����ϵ�ֽ�������е�K��ͬ����Ѱ���K���ڵ��Լ�����K֮���ֽ�ƶ�Ӯ�����������Լ��ƵĶ�β��
ע�⣺Ϊ�˲������㣬�����Ƶ�˳���������ϵ�˳���෴�ġ�
��ʱ��A��B˫����������Ϊ��
A����[K, A, 2, A, 9, 5, A]
B����[5, J, 5, Q, 6, K, 4, K, X, 7, 8, 2, K]
Ӯ�Ƶ�һ���������ơ�Ҳ����B���ų�5��A��K��B��J��A��A��B��5����Ӯ���ˡ�
5,K,J,A,5
��ʱ˫�������ƣ�
A����[2, A, 9, 5, A]
B����[Q, 6, K, 4, K, X, 7, 8, 2, K, 5, A, J, K, 5]
    ע�⣺�����ʱ��Ӯ�Ƶ�һ�������ܰ����ϵ��ƶ�Ӯ�ߣ�����������ͬ�Ƶ㼰���м�Ĳ��֡���������Σ�����Ӯ�Ƶ�һ���������ƣ��е�ʱ���һ������Ӯ�ˣ�Ҳ������ġ�
    ��ĳһ�������������һ���ƣ����޷���������Ӯȡ��ʱ����Ϸ����������
    ���ڱ����ĳ�ʼ��������£����A���������B����������Ϊ��
9K2A62KAX58K57KJ5
    ��������������֪˫����ʼ���򣬼�����Ϸ����ʱ��Ӯ��һ����������򡣵���Ϸ�޷�����ʱ�����-1��
����Ϊ2�У�2�������ֱ��ʾA��B˫����ʼ����������С�
���Ϊ1�У�1��������ʾA�ȳ��ƣ����Ӯ��һ�����������
���磬
���룺
96J5A898QA
6278A7Q973
�����Ӧ�������
2J9A7QA6Q6889977
�ٱ��磬
���룺
25663K6X7448
J88A5KJXX45A
�����Ӧ�������
6KAJ458KXAX885XJ645
����Լ��������Ĵ��ĳ��Ȳ�����30
��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M
CPU����  < 1000ms
���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�
���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
��������ֱ����ǣ�Main��������Ч���봦��
----------------------------
�����л�˵��
    ����ɾ��ǰ�ߵģ���Ҫ������.... ��������飬��Ҫ��һ�����ģ�����汣������Ϸ����ǰ�������õ�����ı�Ե��
�����л�˵��
    ������Ҳ����������ÿ�β���������һ���µĴ���
ĬĬ�л�˵��
    ��һ�㶼��֨�������ǵ��͵Ķ��нṹ����̬������ã�û�У��Լ���һ���£�
*/
public class Carriage {
	static class Queue {
		char[] data;
		int head;
		int tail;

		public Queue(char[] data, int head, int tail) {
			this.data = data;
			this.head = head;
			this.tail = tail;
		}

		public Queue() {
			data = new char[100];
			head = 0;
		}
	}

	static class Stack {
		char[] data;
		int head;
		int tail;

		public Stack(char[] data, int head, int tail) {
			this.data = data;
			this.head = head;
			this.tail = tail;
		}

		public Stack() {
			data = new char[100];
			head = 0;
			tail = 0;
		}
	}

	static Queue queueA = new Queue();
	static Queue queueB = new Queue();
	static Stack used = new Stack();
	static char cardA = ' ';
	static char cardB = ' ';

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String tempA = scanner.next();
		String tempB = scanner.next();

		scanner.close();

		queueA.data = addChar(queueA.data, tempA);
		queueB.data = addChar(queueB.data, tempB);
		queueA.tail = tempA.length();
		queueB.tail = tempB.length();
		while (queueA.head != queueA.tail && queueB.head != queueB.tail) {
			A();
			B();
			for (int i = 0; i < used.tail - 1; i++) {
				if (used.data[i] == used.data[used.tail - 1]) {
					if (used.data[used.tail - 1] == cardA) {
						for (int j = used.tail - 1; j >= i; j--) {
							queueA.data[queueA.tail] = used.data[j];
							queueA.tail++;
						}
						used.tail = i;
						A();
					} else if (used.data[used.tail - 1] == cardB) {
						for (int j = used.tail - 1; j >= i; j--) {
							queueB.data[queueB.tail] = used.data[j];
							queueB.tail++;
						}
						used.tail = i;
						B();
					}
				}
			}
		}

		if (queueA.head == queueA.tail) {
			for (int i = queueB.head; i < queueB.tail; i++) {
				System.out.print(queueB.data[i]);
			}
		} else if (queueB.head == queueB.tail) {
			for (int i = queueA.head; i < queueA.tail; i++) {
				System.out.print(queueA.data[i]);
			}
		}
	}

	public static char[] addChar(char[] charArr, String temp) {
		for (int i = 0; i < temp.length(); i++) {
			charArr[i] = temp.charAt(i);
		}
		return charArr;
	}

	public static void A() {
		used.data[used.tail] = queueA.data[queueA.head];
		used.tail++;
		cardA = queueA.data[queueA.head];
		queueA.head++;
	}

	public static void B() {
		used.data[used.tail] = queueB.data[queueB.head];
		used.tail++;
		cardB = queueB.data[queueB.head];
		queueB.head++;
	}
}
