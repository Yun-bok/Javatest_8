package sec07;

public class KumhoTire extends Tire {
	// �ʵ�
	// ������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// �޼ҵ�
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if (accmulatedRotation < maxRotation) { // ������ ����ȸ������ Ÿ�̾������ ������ �����ġ���ִ� Ÿ�̾ �ִ��ּҰ� ����˷���
			System.out.println(location + "KumhoTire ����:" + (maxRotation - accmulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + "KumhoTire ��ũ ***");
			return false;
		}
	}
}
