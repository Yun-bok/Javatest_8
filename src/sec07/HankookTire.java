package sec07;

public class HankookTire extends Tire {
	// �ʵ�
	// ������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accmulatedRotation;// ���� ȸ���� +1
		if (accmulatedRotation < maxRotation) { // ������ ����ȸ������ Ÿ�̾������ ������ �����ġ���ִ� Ÿ�̾ �ִ��ּҰ� ����˷���
			System.out.println(location + "HankookTire ����:" + (maxRotation - accmulatedRotation));
			return true;
		} else {
			System.out.println("***" + location + "HankookTire ��ũ ***");
			return false;
		}

	}
}
