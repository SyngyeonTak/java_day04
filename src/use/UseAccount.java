package use;
/*
	UseAccount(사용하려는 객체)---> Account(사용당할 객체)공개되어야 함
*/
//사용하려는 클래스의 위치를 알려줍시다.
import bank.Account;
import bank.Customer;
class UseAccount{
	public static void main(String[] args){
		Account acc = new Account();//계좌 클래스 생성(public이라 여기까지는 가능함)
		
		//bank 은행명은 public으로 선언되어 있으므로, 무조건 접근이 가능
		System.out.println(acc.bank);

		//customer는 protected로 선언되어 있으므로 상속관계에 있거나 같은 패키지
		//경우에만 접근이 가능... 현재 UseAccount는 Accoun와 상속관계가 없고
		//서로 다른 패키지이므로, 데이터 접근이 불가능
		//System.out.println(acc.customer);

		//계좌번호 num변수는 개발자가 아무것도 명시하지 않음
		//이러한 접근제한자를 default, 접근 제한자라고한다.
		//default라는 키워드는 명시해서는 안된다.
		//default 접근 제한자는 같은 패키지에 있는 클래스끼리만 접근을 허용
		//protected보다 한단계 더 까다로움(즉 상속관계에 있어도, 같은 패키지가 아니라면 접근 불가임)
		//num is not public in Account, cannot be accessed from outside package
		//공개되어 있지 않으므로 외부에서 접근이 불가능하다.
		//System.out.println(acc.num);
		//우리가 지금까지 실습했던 모든 클래스가 사실 default였고, 우리는 같은 디렉토리에서
		//실습을 해왔기 때문에 지금까지 이런 에러를 만나지 않았던 것 뿐이다.

		//계좌 잔액 balance를 테스트
		//balance는 가장 강력한 접근제한자인 private이 적용되었으므로, Account클래스 스스로
		//만 접근이 가능 ,따라서 우리는 Account 자신이 아니라서 절대 사용불가
		//완전 폐쇄적....
		//System.out.println(acc.balance);//컴파일하면 에러
		//balance has private access in Account(private 접근제한자가 적용되어 있다)
		
		//private은 너무 강력해서 아무도 못쓰는데 그럼 왜 만들까???
		//acc.balance = 10; //이 방법은 직접 접근이므로 불가능
		acc.setBalance(10);//10원으로 수정. 이 방법은 메서드를 통해 접근이므로 가능
		System.out.println(acc.getBalance());
	
		Customer c1 = new Customer();
		c1.setName("승연");
		c1.setAge(25);
		c1.setIsMarry(false);
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getIsMarry());
	}
}
