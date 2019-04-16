package breadthFirstSearch;

import java.util.ArrayList;
import java.util.Scanner;

/*
�����̶���ʽ
��������
	�˻ʺ��������������ϷŻʺ󣬻��಻�������󷽰���
	�任һ�����ӣ��������а˳����⣬�������⣬�˱����⣬�������⣬ע������
	�����������ӻ��ɳ���ͬʱ����Ҳ�û���ȷ��˵���ǽ���һЩ���졣����������һ��n*n�����̣�������һЩ�����Ͽټ���������Щ����Ȼ���ܷ������ˣ���©��ȥ�ġ�
	���⣬һ���������ܹ���������ͬ��ͬ�С����ڣ������룬�ڹ����Ĺ���������ȵ�һ�����������ȡ�������ʣ����Ĺ�����Χֹ�ڶ���
	���⣬�������̵Ĺ�ģn���Լ��ڶ���������k�����ķ�����(k��0�����ɷų���)
�����ʽ
������һ��һ������n��ʾ���̴�С
����������n�У�ÿ��n���ÿո����������0��1��0����״��ʾ����1��ʾû�ж�
�����ʽ
���������У���i�б�ʾ��i�����ķ�����
��������
3
1 0 1
1 1 1
1 0 1
�������
7
12
4
���ݹ�ģ��Լ��
n<=8*/
public class ChessboardQuestion {
	
	static class Block {
		int line;		//��ǰ����������
		int startPos;		//���鿪ʼλ��
		int endPos;		//�������λ��
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
