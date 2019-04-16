package demo;

public class QueenRandom {
	public static void main(String[] args) {
		
		int counter = 1;
		while (true) {
			
			if (counter == 92) {
				break;
			}
			
			//����
			char[][] chessBoard = new char[8][8];
			
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					chessBoard[i][j] = '*';
				}
			}
			
			for (int i = 0; i < 8; i++) {
				int line = (int)(Math.random() * 8);
				int column = (int)(Math.random() * 8);
				chessBoard[line][column] = 'Q';
			}
			
			if (isQueen(chessBoard)) {
				System.out.println("���: " + counter);
				for (char[] cs : chessBoard) {
					for (char cs2 : cs) {
						System.out.print(cs2 + " ");
					}
					System.out.println();
				}
				System.out.println();
				counter++;
			}
		}
	}
	
	//����Ƿ�����ͬ��ͬ�к�б���޻ʺ�����
	public static boolean isQueen(char[][] chessBoard) {
		
		int counter = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				
				//�������һ���ʺ�
				if (chessBoard[i][j] == 'Q') {
					
					counter++;
					
					//���ͬ�����޻ʺ�
					for (int l = 0; l < 8; l++) {
						if (l != j && chessBoard[i][l] == chessBoard[i][j]) {
							return false;
						}
					}
					
					//���ͬ�����޻ʺ�
					for (int c = 0; c < 8; c++) {
						if (c != i && chessBoard[c][j] == chessBoard[i][j]) {
							return false;
						}
					}
					
					//������ϵ��������޻ʺ�
					for (int rUpLine = i, rUpColumn = j; rUpLine >= 0; rUpLine--, rUpColumn++) {		//����
						if (rUpColumn >= 8) {
							break;
						} else if (rUpLine != i && rUpColumn != j && chessBoard[rUpLine][rUpColumn] == chessBoard[i][j]) {
							return false;
						}
					}
					
					for (int lDownLine = i, lDownColumn = j; lDownLine < 8; lDownLine++, lDownColumn--) {		//����
						if (lDownColumn < 0) {
							break;
						} else if (lDownLine != i && lDownColumn != j && chessBoard[lDownLine][lDownColumn] == chessBoard[i][j]) {
							return false;
						}
					}
					
					//������ϵ��������޻ʺ�
					for (int lUpLine = i, lUpColumn = j; lUpLine >= 0; lUpLine--, lUpColumn--) {		//����
						if (lUpColumn < 0) {
							break;
						} else if (lUpLine != i && lUpColumn != j && chessBoard[lUpLine][lUpColumn] == chessBoard[i][j]) {
							return false;
						}
					}
					
					for (int rDownLine = i, rDownColumn = j; rDownLine < 8; rDownLine++, rDownColumn++) {		//����
						if (rDownColumn >= 8) {
							break;
						} else if (rDownLine != i && rDownColumn != j && chessBoard[rDownLine][rDownColumn] == chessBoard[i][j]) {
							return false;
						}
					}
				}
			}
		}
		
		if (counter == 8) {
			return true;		//���ȫ��������û������, �����а˸��ʺ�ͷ���true
		}
		
		return false;
	}
}