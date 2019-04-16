package demo;

public class QueenRandom {
	public static void main(String[] args) {
		
		int counter = 1;
		while (true) {
			
			if (counter == 92) {
				break;
			}
			
			//棋盘
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
				System.out.println("编号: " + counter);
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
	
	//检查是否满足同行同列和斜边无皇后条件
	public static boolean isQueen(char[][] chessBoard) {
		
		int counter = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				
				//如果碰到一个皇后
				if (chessBoard[i][j] == 'Q') {
					
					counter++;
					
					//检查同行有无皇后
					for (int l = 0; l < 8; l++) {
						if (l != j && chessBoard[i][l] == chessBoard[i][j]) {
							return false;
						}
					}
					
					//检查同列有无皇后
					for (int c = 0; c < 8; c++) {
						if (c != i && chessBoard[c][j] == chessBoard[i][j]) {
							return false;
						}
					}
					
					//检查右上到左下有无皇后
					for (int rUpLine = i, rUpColumn = j; rUpLine >= 0; rUpLine--, rUpColumn++) {		//右上
						if (rUpColumn >= 8) {
							break;
						} else if (rUpLine != i && rUpColumn != j && chessBoard[rUpLine][rUpColumn] == chessBoard[i][j]) {
							return false;
						}
					}
					
					for (int lDownLine = i, lDownColumn = j; lDownLine < 8; lDownLine++, lDownColumn--) {		//左下
						if (lDownColumn < 0) {
							break;
						} else if (lDownLine != i && lDownColumn != j && chessBoard[lDownLine][lDownColumn] == chessBoard[i][j]) {
							return false;
						}
					}
					
					//检查左上到右下有无皇后
					for (int lUpLine = i, lUpColumn = j; lUpLine >= 0; lUpLine--, lUpColumn--) {		//左上
						if (lUpColumn < 0) {
							break;
						} else if (lUpLine != i && lUpColumn != j && chessBoard[lUpLine][lUpColumn] == chessBoard[i][j]) {
							return false;
						}
					}
					
					for (int rDownLine = i, rDownColumn = j; rDownLine < 8; rDownLine++, rDownColumn++) {		//右下
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
			return true;		//如果全部检查完后没有问题, 而且有八个皇后就返回true
		}
		
		return false;
	}
}
