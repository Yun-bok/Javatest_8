package sec07;

public class ex02 {

	public static void main(String[] args) {
		//�߻�Ŭ����
		//����� Ư���� ����
		//����Ǵ� �ʵ�� �޼��带 ������ Ŭ����
		//������,����� -> �ֿϵ���
		//��ü�� ���� ������� ���� Ŭ���� -> ��ü �����Ұ�   //��ü��������ٴ� ���̰�ũ��
		//�����ڸ��� Ŭ������ �ʵ�� �޼��� �̸��� �ٸ��� -> ����
		//�߻�޼��� ��밡��
		//�߻�޼��� - ����θ� �ۼ�, ����� {} �ۼ�x
		//�߻�޼��� - �ڽ�Ŭ�������� ������ �������̵� �ؾ��Ѵ�.
		//Pet pet = new Pet(); �߻�Ŭ���� -> ��ü���� �Ұ�
		Dog dog = new Dog();
		dog.color = "������";
		dog.bite();
		dog.Eat();
	}

}

abstract class Pet{ //abstract == �߻�Ŭ���� Ű����
	String color;
	void Sound() {
		System.out.println("�ֿϵ��� �����Ҹ�");
	}
	//�߻�޼���
	abstract void Eat();
	
}
class Dog extends Pet{ //������ Dog�� ���콺�� ��� ù��°==�߻�޼��带 �߰Բ� �������� ���
	void bite() {
		
	}
	@Override
	void Eat() {
		// TODO Auto-generated method stub
		
	}

	
}
//class Cat extends Pet{

//	@Override
//	void Eat() {
		// TODO Auto-generated method stub
		
//	}
	
//}
