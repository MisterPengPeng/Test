package demo;


public class Queen {
	public static void main(String[] args) {
		
		//棋盘
		char[][] chessBoard = new char[8][8];
		int counter = 1;		//计数器
		
		for (int a = 0; a < 8; a++) {		//第一行
			for (int i = 0; i < 8; i++) {		//每次循环都使第一行重置
				chessBoard[0][i] = '*';
			}
			chessBoard[0][a] = 'Q';
			
			for (int b = 0; b < 8; b++) {		//第二行
				for (int i = 0; i < 8; i++) {		//每次循环都使第二行重置
					chessBoard[1][i] = '*';
				}
				chessBoard[1][b] = 'Q';
				
				for (int c = 0; c < 8; c++) {		//第三行
					for (int i = 0; i < 8; i++) {		//每次循环都使第三行重置
						chessBoard[2][i] = '*';
					}
					chessBoard[2][c] = 'Q';
					
					for (int d = 0; d < 8; d++) {		//第四行
						for (int i = 0; i < 8; i++) {		//每次循环都使第四行重置
							chessBoard[3][i] = '*';
						}
						chessBoard[3][d] = 'Q';
						
						for (int e = 0; e < 8; e++) {		//第五行
							for (int i = 0; i < 8; i++) {		//每次循环都使第五行重置
								chessBoard[4][i] = '*';
							}
							chessBoard[4][e] = 'Q';
							
							for (int f = 0; f < 8; f++) {		//第六行
								for (int i = 0; i < 8; i++) {		//每次循环都使第六行重置
									chessBoard[5][i] = '*';
								}
								chessBoard[5][f] = 'Q';
								
								for (int g = 0; g < 8; g++) {		//第七行
									for (int i = 0; i < 8; i++) {		//每次循环都使第七行重置
										chessBoard[6][i] = '*';
									}
									chessBoard[6][g] = 'Q';
									
									for (int h = 0; h < 8; h++) {		//第八行
										for (int i = 0; i < 8; i++) {		//每次循环都使第八行重置
											chessBoard[7][i] = '*';
										}
										chessBoard[7][h] = 'Q';
										if (isQueen(chessBoard)) {		//判断棋盘是否满足条件
											System.out.println("解法: " + counter);
											counter++;
											for (char[] hs : chessBoard) {		//输出棋盘
												for (char hs2 : hs) {
													System.out.print(hs2 + " ");
												}
												System.out.println();
											}
											System.out.println();
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
	}
	
	//检查是否满足同行同列和斜边无皇后条件
		public static boolean isQueen(char[][] chessBoard) {

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					
					//如果碰到一个皇后
					if (chessBoard[i][j] == 'Q') {
						
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
			return true;		//如果全部检查完后没有问题, 而且有八个皇后就返回true
		}
}
