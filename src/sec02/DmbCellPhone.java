package sec02;

public class DmbCellPhone extends Cellphone{ //���� Ŭ���� ��밡��
	//��ӹ������ν� �ߺ��Ǵºκ����־� ����� ��������.
	//�𵨰� �÷��� �������� ��ӹ޾Ҵ�
	//�ʵ� 
	int channel;
	
	//������
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä��"+channel+"�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��"+channel+"�� ���� �ٲ�ϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
	
}
