package car;

public class Taxi extends Car{
	//택시만이 갖는 특징
	//Taxi클래스의 디폴트 생성자에서는 무조건 super()가 들어있으므로, 매개변수 없는 생성자인
	//Car()를 호출하고 있다. 따라서 현재 Car에는 Car() 생성자 대신에 Car(String brand)
	//만 존재하므로, 생성자 호출 시 에러가 난다.

	//부모의 매개변수 있는 생성자를 직접 호출해주기 위해, 개발자가 생성자를 정의하고 있음
	//public Taxi(){
		//super("Benz");//매개변수 있는 생성자 호출
	//}

	public void pass(){
		System.out.println("승객을 태워요");
	}
}
