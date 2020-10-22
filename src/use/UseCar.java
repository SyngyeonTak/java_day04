package use;
//현업에서는 *를 잘 쓰지 않는다. 저렇게 해버리면 import에서 다루고자하는
//기술이 무엇인지 빨리 해석이 안된다. 따라서 따로따로 해주는 것이 좋다
import car.Taxi;
import car.Truck;
import car.Bus;

class UseCar{
	public static void main(String[] args){
		Taxi t = new Taxi();// 얼핏보기에는 택시만 생성될 것 같지만
									//택시보다 앞선 부모인 Car가 존재해야, 택시도 존재할 수 있기 때문에
									//js시절의 원리가 그대로 적용되어 Car인스턴스도 생성된다.
		t.pass();//택시 메서드 호출되는지 확인
					//택시 클래스 코드안에는 없지만, Car클래스가 보유한 변수가 메서드 호출해보자
					//만인 호출이 되면 Car인스턴스가 생성된게 증명되는 것
		t.move(); //분명 move() 메서드는 택세에 없는데도 이게 호출된다면 
						//택시가 부모님꺼를 마음대로 접근한 것
		//UseCar 클래스 실행
		
	}
}
