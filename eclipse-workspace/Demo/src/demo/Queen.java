package demo;


public class Queen {
	public static void main(String[] args) {
		
		//����
		char[][] chessBoard = new char[8][8];
		int counter = 1;		//������
		
		for (int a = 0; a < 8; a++) {		//��һ��
			for (int i = 0; i < 8; i++) {		//ÿ��ѭ����ʹ��һ������
				chessBoard[0][i] = '*';
			}
			chessBoard[0][a] = 'Q';
			
			for (int b = 0; b < 8; b++) {		//�ڶ���
				for (int i = 0; i < 8; i++) {		//ÿ��ѭ����ʹ�ڶ�������
					chessBoard[1][i] = '*';
				}
				chessBoard[1][b] = 'Q';
				
				for (int c = 0; c < 8; c++) {		//������
					for (int i = 0; i < 8; i++) {		//ÿ��ѭ����ʹ����������
						chessBoard[2][i] = '*';
					}
					chessBoard[2][c] = 'Q';
					
					for (int d = 0; d < 8; d++) {		//������
						for (int i = 0; i < 8; i++) {		//ÿ��ѭ����ʹ����������
							chessBoard[3][i] = '*';
						}
						chessBoard[3][d] = 'Q';
						
						for (int e = 0; e < 8; e++) {		//������
							for (int i = 0; i < 8; i++) {		//ÿ��ѭ����ʹ����������
								chessBoard[4][i] = '*';
							}
							chessBoard[4][e] = 'Q';
							
							for (int f = 0; f < 8; f++) {		//������
								for (int i = 0; i < 8; i++) {		//ÿ��ѭ����ʹ����������
									chessBoard[5][i] = '*';
								}
								chessBoard[5][f] = 'Q';
								
								for (int g = 0; g < 8; g++) {		//������
									for (int i = 0; i < 8; i++) {		//ÿ��ѭ����ʹ����������
										chessBoard[6][i] = '*';
									}
									chessBoard[6][g] = 'Q';
									
									for (int h = 0; h < 8; h++) {		//�ڰ���
										for (int i = 0; i < 8; i++) {		//ÿ��ѭ����ʹ�ڰ�������
											chessBoard[7][i] = '*';
										}
										chessBoard[7][h] = 'Q';
										if (isQueen(chessBoard)) {		//�ж������Ƿ���������
											System.out.println("�ⷨ: " + counter);
											counter++;
											for (char[] hs : chessBoard) {		//�������
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
			return true;		//���ȫ��������û������, �����а˸��ʺ�ͷ���true
		}
}
