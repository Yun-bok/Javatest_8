package sec07;

public class ex01 {
	public static void main(String[] args) {

	//������
	//���� -> ���� ���¸� ������ ����
	//������ Ÿ���� ��������� �پ��� ����� ������ ����
	//�پ��� ��ü�� �̿��Ҽ� �ִ� ����
	//�ϳ��� Ÿ�Կ� ���� ��ü�� ������ �� �ִ�.
	//�θ�Ÿ���� ��� �ڽ� ��ü�� ���Ե� �� �ִ�.
	
	//double dou = 4; //�����ε� ��ū ����� Ÿ�Ժ�ȯ�� �����ϴ�
	//Ŭ���� Ÿ�Ժ�ȯ
	//�ڵ� Ÿ�Ժ�ȯ
	//�θ� Ŭ���� ���� = �ڽ�Ŭ���� Ÿ�� ��ü;
	//�ڽ�->�θ�(�θ��Ǻθ�) �ڵ����� Ÿ�Ժ�ȯ ����
	//�θ��� Ÿ������ ���ϸ� ��ü�� �θ� ����� �ʵ�� �޼��常 ȣ�Ⱑ��
	//�������̵� �� �޼���� �ڽ��� �޼��� ȣ��
	//�ʵ��� ������
	pet pet1 = new pet(); //Pet Ŭ���� Ÿ���� pet1 ����
	pet pet2 = new Cat(); //Cat Ŭ���� Ÿ��->  Pet��ȯ pet2 ����
	dog dog1 = new dog(); //DogŬ����Ÿ�� dog1��ü ����
	pet pet3 = dog1;
	
	pet1.Sound();
	pet2.Sound();
	pet3.Sound();
 
	//����Ŭ������ �������� ��ü�� �־���� �̰� �������̴� , ��ü������ ���ֳ����� �ܰ�����
	
	//�迭�� ����ϴ� ���
	//Ÿ��[] �����̸� = new Ÿ��[size];{3,2,1}
	
	pet[] pet_arr2 = new pet[3];
	pet_arr2[0] = new pet();
	pet_arr2[1] = new Cat();
	pet_arr2[2] = new dog();
	
	System.out.println("�迭�� ����ϴ¹��");
	pet[] pet_arr = {new pet(), new Cat(), new dog() };
	for(int i=0; i<pet_arr.length; i++) {
		pet_arr[i].Sound();
	}
	
	for(pet pet : pet_arr) {
		pet1.Sound();
	}
	
	//�Ű������� ������
	//�Ű������� Ŭ���� ����
	
	//�θ�Ÿ������ ����ȯ�ȴ�
	System.out.println("�Ű������� ������");
	printSound(pet1);  //Pet
	printSound(pet2);  //Cat -> Pet
	//Dog dog2 = new Dog();
	//printSound(dog2);  //Dog -> pet
	
	//���� Ÿ�Ժ�ȯ(Casting)
	//�θ� -> �ڽ�Ÿ���� ��ȯ
	//���� : �ڽ� -> �θ� ->�ڽ�
	//�ڽ�Ÿ�Կ��� �θ�Ÿ������ �ڵ���ȯ�� �ڽ����� �ٽ� �ٲܶ� ����
	//�ʿ��Ѱ��
	//�ڽ� Ÿ�Կ� ����� �ʵ�� �޼��带 �ٽ� ����ؾ� �Ҷ�
	//(�θ�� ��ȯ�ϸ� �θ��� �ʵ�� �޼��常 ��밡���ؼ�
	//pet2.scratch(); //Cat
	//pet3.bite(); 	  //Dog
	System.out.println("���� Ÿ�Ժ�ȯ");
	pet pet4 = new Cat(); //�ڵ� Ÿ�Ժ�ȯ -Cat(�ڽ�) -> Pet(�θ�)
	Cat cat_a = (Cat)pet4;
	cat_a.scratch();
//	dog dog3 = (dog)pet4; //Cat -> Pet -> Dog ����
//	dog3.bite();
	
	//��ü Ÿ��Ȯ��
	//���� instanceof ����
	//������ Ȯ���ϰ� ������ü ���� Ŭ���� Ȯ���ϰ� ���� Ÿ��
	boolean result = pet4 instanceof Cat; //�߸��� Ÿ�Ժ�ȯ�� ���ϱ� ���ؼ� �̷������� �ʿ��ϴ�
	if(result) {// �����ϰ� �ٲ��ټ��ִ�
		Cat cat2 = (Cat)pet4;
		cat2.scratch();
	}
	
	}
	static void printSound(pet pet) {
		pet.Sound();
		
	}
}

class pet{//�����ϱ� ���� ���������� ���� //�θ�� ���̰� �ؿ��� �ڽĵ��̴�
	void Sound() {
		System.out.println("�ֿϵ��� �����Ҹ�");
	}
}
class dog extends pet{
	@Override //�θ𿡰� ��ӹ޾Ƽ� ������
	void Sound() { //pet�� sound�� ������
		System.out.println("�۸�");
	}
	
	void bite() {
		System.out.println("������");
	}
	
}
class Cat extends pet{
	@Override
	void Sound() {
		System.out.println("�߿�");
	}
	
	void scratch() {
		System.out.println("������");
	}
}
