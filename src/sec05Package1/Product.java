package sec05Package1;

public class Product {
	//��ǰ�� ����
	int price;
	//��ǰ ���Ž� �����ϴ� ����Ʈ
	int bonusPoint;
	
	//����Ʈ ������(�⺻������) - ������ TV �⺻������ ����
	Product() {
		System.out.println("�θ� �⺻������");
	}
	
	Product(int price){
		System.out.println("�θ� ������");
		this.price = price;
		bonusPoint = (int)(price/10.0);//double���� int������ ���� �ݿø�?
	}
	
	public void print() {
		System.out.println("����: "+price+",����Ʈ: "+bonusPoint);
	}

}
