package ������0909;


/*
TV -> broduct ���
-�ʵ�: sdr (Ư���� ������)
-������ 3�� �Ű�����
-�޼���: print() �������̵� -> "���ΰ��� : " + ���� * sdr 
 */
class TV extends Product {	
	double sdr;
	
	
	public TV(int price, double Dc , double sdr) {
		super(price, Dc);
		this.sdr = sdr;
	}
	
	@Override
	void print() {
		System.out.println("���ΰ��� : " + (price * sdr));
	}
}