package recursion;

public class QueenRecursion {
	static char[][] chessBoard = new char[8][8];
	static int counter = 1;
	
	public static void main(String[] args) {
		Recursion(0, 0);
		for (char[] cs : chessBoard) {
			for (char x : cs) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
	
	public static void Recursion(int line, int column) {
		for (int l = 0; l < 8; l++) {
			for (int c = 0; c < 8; c++) {
				chessBoard[l][c] = '*';
			}
		}
		
		if (isQueen(chessBoard)) {
			counter++;
			if (line < 8 && column < 8) {
				chessBoard[line][column] = 'Q';
			}
		}
		if (counter == 9) {
			return;
		}
		Recursion(line + 1, column);
	}
	
	//����Ƿ�����ͬ��ͬ�к�б���޻ʺ�����
	public static boolean isQueen(char[][] chessBoard) {

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				
				//�������һ���ʺ�
				if (chessBoard[i][j] == 'Q') {
					
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
		return true;		//���ȫ��������û������, ����true
	}
}
