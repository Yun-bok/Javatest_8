package sec02;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellphone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���","����",10);
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("��: "+dmbCellPhone.model);
		System.out.println("����: "+dmbCellPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä��: "+dmbCellPhone.channel);
		
		//CellPhone���κ��� ��ӹ��� �޼��� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ����~");
		dmbCellPhone.sendVoice("��~��~");
		dmbCellPhone.hangUp();
		

		//DmbCellphone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
