package ������0910ex;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine(); // �� abc�� str�� ������ �Է¹��� ���ڿ��� ���� �������ִ�
		char[] ch_arr = str.toCharArray();
		// char -> 'a' ����Ÿ�� �����ϴ� ���� ������ ���� //a���������� �����Ҽ��ִ�
		// char[] ->���� Ÿ���� ���� ������ �����Ҽ��ִ� ����
		// char ('a') ('b') ('c')
		// ch_arr[0] ch_arr[1] ch_arr[2] 1�������ϸ鼭 �����ü��ִ�
		// 4���̸� �迭�� �⺻

		// ����ö� �ε��� ��
		int count = 1;
		// ���ʹ��ں��� ������ ���ڶ� ��
		// a �� ������ b�� ������ c�������� �̷���
		// ������ ���ڴ� �̹� �񱳸� �����ϱ� üũx ������
		for (int i = 0; i < ch_arr.length; i++) {// 0���� length ���ڹ迭�� ���� 0~7����
			// ch_arr[i] -> ���ʺ��� ���� �������� ������Ѵ� ��ӹݺ��ϸ� 1�������ϸ�

			// �迭�� ũ�⸸ŭ �ݺ��ϸ� �����ü��ִ� ���
			// i+1 �̸� i�� a�϶� j�� b���� ������
			if (ch_arr[i] != ' ') {
				for (int j = i + 1; j < ch_arr.length; j++) { // �����ϳ������ö� ��� �ٲ������ִ� $
					// i = 0 , j = 1 2 3 4 5 6 7 ( 1�ݺ� ������ 2�ݺ� ������ 3...
					if (ch_arr[i] == ch_arr[j]) {
						count++; // ��������������
						ch_arr[j] = ' ';// ������� $�ݺ�
					}
				}
				System.out.println(ch_arr[i] + "=" + count);
				count = 1;
			}
		}

	}
}
/*
 * 
 * q1)char[](���ڹ迭)���� ���� ������ ������ ����Ͻÿ�. (������������ ��繮��) char[]ch_arr =
 * "abcdadcc".toCharArray(); //a�ΰ� b1�� �̾ȿ� �̷��� a =2 b - 1 ���� c - 3 d - 2 char[]
 * ch_arr ch_arr[0] a ch_arr[1] b ch_arr[2] c ----- for(int i=0;
 * i<ch_arr.length; i++){ i��1�̸�j��2�ϱ� 0���� 1���� 7���� ���ϰڴ� �ݺ����ȿ��� //i==0 j 1~7 �������ڷ�
 * ��������� for(int j = i+1; j<ch_arr.length; j++){ //abcdadcc //������������ ī��Ʈ ����
 * //�ߺ����ΰ�ġ�� ī��Ʈ //����ģ���� ' ' } }
 * 
 * 
 */
