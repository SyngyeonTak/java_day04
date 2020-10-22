package use;
import animal.Dog;//Dog이라는 클래스의 package 선언부를 그대로 적으면됨
class UseDog{
	public static void main(String[] args){
		//현재 클래스와는 다른 경로에 있는 클래스를 사용해야 하는데,
		//컴파일러가 어떻게Dog.class를 찾을 수 있을까?

		//이 문제를 해결하려면 클래스의 경로를 알려줘야됨
		//일반적으로 경로를 등록 할 때는 환경변수를 이용
		//경로가 일반 파일일 경우는 path환경변수 이지만
		//경로가 클래스파일일 경우는 classpath환경변수를 이용
		//이때, classpath환경변수에 어느 경로를 등록해야 할지 고민...
		Dog d = new Dog();
		d.run();
	}
}
