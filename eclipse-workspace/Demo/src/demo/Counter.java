package demo;

import java.util.Scanner;

/*
小计算器

模拟程序型计算器，依次输入指令，可能包含的指令有
1. 数字：'NUM X'，X为一个只包含大写字母和数字的字符串，表示一个当前进制的数
2. 运算指令：'ADD','SUB','MUL','DIV','MOD'，分别表示加减乘，除法取商，除法取余
3. 进制转换指令：'CHANGE K'，将当前进制转换为K进制(2≤K≤36)
4. 输出指令：'EQUAL'，以当前进制输出结果
5. 重置指令：'CLEAR'，清除当前数字

指令按照以下规则给出：
数字，运算指令不会连续给出，进制转换指令，输出指令，重置指令有可能连续给出
运算指令后出现的第一个数字，表示参与运算的数字。且在该运算指令和该数字中间不会出现运算指令和输出指令
重置指令后出现的第一个数字，表示基础值。且在重置指令和第一个数字中间不会出现运算指令和输出指令
进制转换指令可能出现在任何地方

运算过程中中间变量均为非负整数，且小于2^63。
以大写的'A'~'Z'表示10~35

输入格式
第1行：1个n，表示指令数量
第2..n+1行：每行给出一条指令。指令序列一定以'CLEAR'作为开始，并且满足指令规则

输出格式
依次给出每一次'EQUAL'得到的结果

样例输入
7
CLEAR
NUM 1024
CHANGE 2
ADD
NUM 100000
CHANGE 8
EQUAL

样例输出
2040
*/
public class Counter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputnum = scanner.nextInt();
		for (int i = 0; i < inputnum; i++) {
			String input = scanner.next();
			if (!input.equals("CLEAR") && i == 0) {
				System.out.println("第一条语句以\"CLEAR\"开始");
			}
			switch (input) {
			case "NUM":
				Num();
				break;
				
			case "ADD":
				Add();
				break;
				
			case "SUB":
				Sub();
				break;
				
			case "MUL":
				Mul();
				break;
				
			case "DIV":
				Div();
				break;
				
			case "MOD":
				Mod();
				break;
				
			case "CHANGE":
				Change();
				break;
	
			case "EQUAL":
				Equal();
				break;
				
			case "CLEAR":
				Clear();
				break;
			}
		}
		scanner.close();
	}

	private static void Clear() {
		//清除当前数字
		
	}

	private static void Equal() {
		//输出结果
		
	}

	private static void Change() {
		//改变进制
		
	}

	private static void Mod() {
		//取余
		
	}

	private static void Div() {
		//取商
		
	}

	private static void Mul() {
		//相乘
		
	}

	private static void Sub() {
		//相减
		
	}

	private static void Add() {
		//相加
		
	}

	private static void Num() {
		//表示一个当前进制数字
		
	}
}
