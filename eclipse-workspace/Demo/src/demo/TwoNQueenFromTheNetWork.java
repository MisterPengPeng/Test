package demo;

import java.util.Scanner;

/*
** 2n�ʺ����� **

����һ��n*n�����̣���������һЩλ�ò��ܷŻʺ�.
����Ҫ�������з���n���ڻʺ��n���׻ʺ�ʹ����������ڻʺ󶼲���ͬһ�С�ͬһ�л�ͬһ���Խ����ϣ�����������׻ʺ󶼲���ͬһ�С�ͬһ�л�ͬһ���Խ�����.
���ܹ��ж����ַŷ���
nС�ڵ���8.

����
����ĵ�һ��Ϊһ������n����ʾ���̵Ĵ�С�� 
������n�У�ÿ��n��0��1�����������һ������Ϊ1����ʾ��Ӧ��λ�ÿ��ԷŻʺ����һ������Ϊ0����ʾ��Ӧ��λ�ò����ԷŻʺ� 

���
���һ����������ʾ�ܹ��ж����ַŷ��� 

��������
4 
1  1  1  1 
1  1  1  1 
1  1  1  1 
1  1  1  1 

�������
2
*/
public class TwoNQueenFromTheNetWork {   
	static int n;									//n��ʾ���̵Ĵ�С��count��Ϊ�����ᵽ�ļ���������¼���÷����ĸ���
	static int count = 0;
    static int map[][];								//��ά�����ʾ����  
    public static void main(String args[]) {    
        Scanner scanner = new Scanner(System.in);    
        n = scanner.nextInt();						//��ر�����¼��   
        map = new int[n][n];    
        for (int i = 0; i < n; i++) {               //���̾���ֵ��¼�루0��1��  
            for (int j = 0; j < n; j++) {
                map[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        Put(0, 2);									//�ӵ�һ�п�ʼ���а׻ʺ�ķ��ã�2����ף�3�����  
        System.out.println(count);					//�����еķ�����Ѱ����ɺ�����ҵ��ķ�������  
    }
    
	//���ûʺ�ĺ���
    public static void Put(int t, int s) {
    	
        if (t == n) {								//���е�ǰ���ͻʺ�ķ��������Ƿ�ﵽҪ�󣬼��Ƿ������̵����һ��      
            if (s == 2) {
            	Put(0, 3);							//����׻ʺ���óɹ�������кڻʺ�ķ���
            } else {          
            	count++;							//���÷����ҵ���һ�֣�������������ֵ��һ  
            }       
            return;									//��ǰ������ù��̽��������г���Ļ���  
        }
        
        for (int i = 0; i < n; i++) {				//��ÿһ�е�ֵ������в���                
            if (map[t][i] != 1) {
            	continue;							//��ǰλ���Ƿ�Ϊ1���ж�  
            }
            if (Check(t, i, s)) {
            	map[t][i] = s;						//�Ƿ�������ĿҪ���жϣ����㸳ֵ
            } else {
            	continue;							//�����㣬ͬһ�е���һ��λ��  
            }
            Put(t + 1, s);							//��һ�лʺ�ķ���  
            map[t][i] = 1;							//���ݷ��Ĺؼ�        
        }
        
        return;										//������Ӧ�Ļ���  
    }    
    
    //������ĿҪ����жϺ���
    public static boolean Check(int t,int i,int s) {
    	
    	//��ǰλ���Ϸ��Ƿ��������ͬ�ʺ�ķ��� �������µĻ�û�Ų����
        for (int q = t - 1; q >= 0; q--) {
            if (map[q][i] == s) {
            	return false;    
            }
        }
        
        //�����Խ��� �������µĻ�û�Ų����
        for (int q = t - 1, w = i - 1; q >= 0 && w >= 0; q--, w--) {   
            if (map[q][w] == s) {
            	return false;    
            }
        }
        
        //����ҶԽ��� �������µĻ�û�Ų����
        for (int q = t - 1, w = i + 1; q >= 0 && w <= n - 1; q--, w++) {    
            if (map[q][w] == s) {
            	return false;
            }
        }    
        return true;                                 //����������£�����Խ��е�ǰ�ʺ�ķ���  
    }    
}
