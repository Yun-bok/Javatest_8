package ������0909;
/*
Car -> Product ���
- �ʵ�: ����
- ������ 3�� �Ű�����
- �޼���: print() �������̵� -> "���ΰ��� : " + ���� * sdr-����
*/
public class Car extends Product {
	int tax;
	
	public Car(int price, double Dc , int tax) {
		super(price, Dc);
		this.tax = tax;
		
	}
	
	@Override
	void print() {
		System.out.println("���ΰ��� : " + ((price * Dc)-tax));
	}
}

