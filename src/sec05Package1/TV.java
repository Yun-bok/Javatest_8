package sec05Package1;

public class TV extends Product{
	int ch;
	TV(){
		//super();
		//super() -> �θ� �⺻������ ȣ�� (���� ����)
		//super(�Ű�����) �Ű������� �ִ� ������ ��밡�� -> �θ������ �� ������ �����Ͽ���
		//�ݵ�� ù��
	}
	
	TV(int price, int ch){
		super(price);
		System.out.println("�ڽ� ������");
		this.ch = ch;
		
	}
	
	//�������̵� - ��ȯŸ�� �Ű����� ��ġ-> �θ�޼���� ������ ���ƾߵȴ�
	//@Override ->������ ������ ���̺����� -> �Ű����� �ٲ㺸�� -> �����ε� ��������
	//-> ������ �����ε� -> ������ �����Ͽ���
	//�������̵� -> ���������ڸ� �� ���������� ���� , �� ����������� �Ұ���
	@Override		//��ҹ��� ����
	public void print() {
		super.print();
		System.out.println("����: "+price+"/����Ʈ: "+bonusPoint+"/ä��: "+ch);
	}

}
