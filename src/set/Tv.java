package set;
//Product ��ӹ���
public class Tv extends Product{
	//�ʵ�
	public double sdr;
	
	//������ 3�� �Ű�����
	public Tv(int price, int sale, double sdr) {
		super(price, sale);
		this.sdr = sdr;
	}
	public void sdr() {//Ư���� ������.. ���Ƿ�?
		double sdr;
		
		
	}


@Override // �θ𿡰� ��ӹ��� ������ ������
	public void print() {
	System.out.println("���ΰ���:"+price*sdr+"����Ʈ: "+(price/10));
}
}