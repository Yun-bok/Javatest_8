package set;

//Product ��ӹ���
public class Car extends Product {
//�ʵ�
	public double tex;

//������
	public Car(int price, int sale, double tex) {
	super(price,sale);
	this.tex = tex;
	
	@Override // �θ𿡰� ��ӹ��� ������ ������
	public void print() {
		System.out.println("���ΰ���:" + price * sdr - tex + "����Ʈ:" + price / 10);
	}
}
	
