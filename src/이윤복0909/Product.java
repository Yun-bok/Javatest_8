package ������0909;
/*
Product Ŭ����
-�ʵ�: ����, ������
-������ 2�� �Ű�����
-�޼���: getter(�⺻), setter(�⺻), 
print() -> ��� :"���ΰ��� : " + ���� * ������
*/
class Product {
	int price;
	double Dc;

	public Product() {
		
	}
	
	public Product(int price, double Dc) {
		this.price = price;
		this.Dc = Dc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDc() {
		return Dc;
	}

	public void setDc(double Dc) {
		this.Dc = Dc;
	}

	void print() {
		System.out.println("���ΰ��� : " + (price * Dc));
	}

}
