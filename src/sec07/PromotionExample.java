package sec07;

public class PromotionExample {
	public static void main(String[] args) {

		//		A
		//     B C         //�ڽ��� ->�θ� ->�θ� �̷������θ� �ȴ�
		//     D E				//�� A->B>D , A->C->E �̷������� ���������� ���������� B->E�� �ȵȴܰ�
		
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	//�θ��� �θ���� ��ӹ������ִ� ���� �����
	A a1 = b;
	A a2 = c;
	A a3 = d;
	A a4 = e;
	
	B b1 =d;
	C c1 = e;
	
	//B b3 = e;
	//C c2 = d;
	
	
	}
}

class A{
	
}
class B extends A{
	
}
class C extends A{
	
}
class D extends B{
	
}
class E extends C{
	
}