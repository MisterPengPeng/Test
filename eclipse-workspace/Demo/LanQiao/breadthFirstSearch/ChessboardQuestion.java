package breadthFirstSearch;

import java.util.ArrayList;
import java.util.Scanner;

/*
　棋盘多项式
问题描述
	八皇后问题是在棋盘上放皇后，互相不攻击，求方案。
	变换一下棋子，还可以有八车问题，八马问题，八兵问题，八王问题，注意别念反。
	在这道题里，棋子换成车，同时棋盘也得换，确切说，是进行一些改造。比如现在有一张n*n的棋盘，我们在一些格子上抠几个洞，这些洞自然不能放棋子了，会漏下去的。
	另外，一个车本来能攻击和它的同行同列。现在，你想想，在攻击的过程中如果踩到一个洞，便会自取灭亡。故，车的攻击范围止于洞。
	此题，给你棋盘的规模n，以及挖洞情况，求放k个车的方案数(k从0到最多可放车数)
输入格式
　　第一行一个整数n表示棋盘大小
　　接下来n行，每行n个用空格隔开的数字0或1，0的形状表示洞，1表示没有洞
输出格式
　　若干行，第i行表示放i个车的方案数
样例输入
3
1 0 1
1 1 1
1 0 1
样例输出
7
12
4
数据规模和约定
n<=8*/
public class ChessboardQuestion {
	
	static class Block {
		int line;		//当前区块所在行
		int startPos;		//区块开始位置
		int endPos;		//区块结束位置
	}
	
	static final int EMPTY = 1;
	static final int HOLE = 0;
	static final int CASTLE = 2;
	static int N = 0;
	static int[][] board;
	static int counter = 0;
	static ArrayList<Block> blocks = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		N = scanner.nextInt();
		board = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
		Block currentBlock = null;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (board[i][j] == EMPTY && currentBlock == null) {
					currentBlock = new Block();
					currentBlock.line = i;
					currentBlock.startPos = j;
				} else if (board[i][j] == HOLE && currentBlock != null) {
					currentBlock.endPos = j;
					blocks.add(currentBlock);
					currentBlock = null;
				}
			}
			
			if (currentBlock != null) {
				currentBlock.endPos = N;
				blocks.add(currentBlock);
				currentBlock = null;
			}
		}
		
		for (int i = 1; i <= blocks.size(); i++) {
			counter = 0;
			dfs(i, 0, 0);
			if (counter > 0) {
				System.out.println(counter);
			} else {
				return;
			}
		}
	}
	
	public static void dfs(int targetCastleNum, int blockIndex, int playedCastleNum) {
		Block block = blocks.get(blockIndex);
		for (int j = block.startPos; j < block.endPos; j++) {
			if (check(block.line, j)) {
				if (playedCastleNum + 1 == targetCastleNum) {
					counter++;
				} else {
					board[block.line][j] = CASTLE;
					dfs(targetCastleNum, blockIndex + 1, playedCastleNum + 1);
					board[block.line][j] = EMPTY;
				}
			}
		}
		if (targetCastleNum - playedCastleNum <= (blocks.size() - 1 - blockIndex)) {
			dfs(targetCastleNum, blockIndex + 1, playedCastleNum);
		}
	}
	
	public static boolean check(int castleI, int castleJ) {
		
		//Left
		for (int j = castleJ; j >= 0; j--) {
			if (board[castleI][j] == CASTLE) {
				return false;
			} else if (board[castleI][j] == HOLE) {
				break;
			}
		}
		
		//Up
		for (int i = castleI; i >= 0; i--) {
			if (board[i][castleJ] == CASTLE) {
				return false;
			} else if (board[i][castleJ] == HOLE) {
				break;
			}
		}
		
		return true;
	}
}
