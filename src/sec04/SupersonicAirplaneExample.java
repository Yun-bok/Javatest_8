package sec04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly(); 
		sa.flymode = SupersonicAirplane.SUPERSONIC;//�����Ӻ���
		sa.fly();
		sa.flymode = SupersonicAirplane.NORMAL;//�ö���
		sa.fly();
		sa.land();

	}

}
