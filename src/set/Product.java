package set;
/*Q1)
Product Ŭ����
-�ʵ�: ����,  ������
-������ 2�� �Ű�����
-�޼��� : getter(�⺻) ,setter (�⺻), 
print() -> ���: "���ΰ��� :" +���� *������+ "����Ʈ :" ����/10
*/
public class Product {
	
	//�ʵ�
		
		private double Dc;
		private int price;
		
	//������
		public Product(int price, double Dc) {
			this.price = price;
			this.Dc = Dc;
		}
		
		//�޼���
		public int setPrice() { //setter
			return price;
		}
		public double setDc(double Dc) {//getter
			this.Dc = Dc ;
			return Dc;
		}
		public void print() {
			System.out.println("���ΰ���: "+price*Dc +"����Ʈ :"+(price/10));
		}
		
		
	
}