package car;

public class Car{
	private String brand;

	//�θ� Ŭ����
	/*
	public Car(){
		System.out.println("�ڽ��� super()ȣ�⿡ ���� �� ȣ��˴ϴ�.");
	}
	*/

	//�����ڰ� �Ű����� �ִ� �����ڸ� ������, �����ڰ� �����ڸ� �����ϸ� �����Ϸ��� ����
	//����Ʈ ������ �ڵ� ������ ����
	//���� CarŬ������ �����ڰ� ���� �� 1���� ��
	public Car(){

	}

	public Car(String brand){
		this.brand = brand;
		System.out.println(this.brand);
	}

	public void move(){
		System.out.println("�ڵ����� ���ϴ�");
	}
}
