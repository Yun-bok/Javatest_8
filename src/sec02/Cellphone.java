package sec02;

public class Cellphone {
	//�ʵ�
	String model;
	String color; //�ڵ����� �Ӽ�(cellphone �ǵ�����)�� �޾ƾ����־���
	
	//������
	Cellphone() {
		System.out.println("Cellphone �⺻������ȣ��");
	}
	
	Cellphone(String model, String color) {
		System.out.println("Cellphone �⺻������ȣ��");
		//super();
	//	super(model,color);
		//this.model = model;
		//this.color = color;
//		this.channel = channel;
	}
	
	//�޼���
	void powerOn() {
		System.out.println("������ ŵ�ϴ�.");
	}
	
	void poweroff() {
		System.out.println("������ ���ϴ�.");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void sendVoice(String message) {
		System.out.println("�ڱ�: "+message);
	}
	void receiveVoice(String message) {
		System.out.println("����:" +message);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
