package sec07;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
	//   6   2    3     4
	//   0   0    0     0  
	//   1   1    1     1
	//   2   2    2     2
	//   2   2    1     1  -> �տ�����
	//   t   k    t     t
	//   2   0    
		for(int i=1; i<10; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("�� ���� HankookTire�� ��ü");
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�� ���� KumhoTire�� ��ü");
				car.frontRightTire = new KumhoTire("�տ�����", 13);
				break;
			case 3:
				System.out.println("�� ���� HankookTire�� ��ü");
				car.backLeftTire = new HankookTire("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�� ���� HankookTire�� ��ü");
				car.backRightTire = new KumhoTire("�ڿ�����", 17);
				break;
			}
			System.out.println("-------------------------------------");
		}

	}

}
