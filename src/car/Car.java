package car;

public class Car{
	private String brand;

	//부모 클래스
	/*
	public Car(){
		System.out.println("자식의 super()호출에 의해 난 호출됩니다.");
	}
	*/

	//개발자가 매개변수 있는 생성자만 정의함, 개발자가 생성자를 정의하면 컴파일러에 의한
	//디폴트 생성자 자동 삽입은 없음
	//따라서 Car클래스는 생성자가 오직 딱 1개면 됨
	public Car(){

	}

	public Car(String brand){
		this.brand = brand;
		System.out.println(this.brand);
	}

	public void move(){
		System.out.println("자동차가 갑니다");
	}
}
