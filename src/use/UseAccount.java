package use;
/*
	UseAccount(����Ϸ��� ��ü)---> Account(������ ��ü)�����Ǿ�� ��
*/
//����Ϸ��� Ŭ������ ��ġ�� �˷��ݽô�.
import bank.Account;
import bank.Customer;
class UseAccount{
	public static void main(String[] args){
		Account acc = new Account();//���� Ŭ���� ����(public�̶� ��������� ������)
		
		//bank ������� public���� ����Ǿ� �����Ƿ�, ������ ������ ����
		System.out.println(acc.bank);

		//customer�� protected�� ����Ǿ� �����Ƿ� ��Ӱ��迡 �ְų� ���� ��Ű��
		//��쿡�� ������ ����... ���� UseAccount�� Accoun�� ��Ӱ��谡 ����
		//���� �ٸ� ��Ű���̹Ƿ�, ������ ������ �Ұ���
		//System.out.println(acc.customer);

		//���¹�ȣ num������ �����ڰ� �ƹ��͵� ������� ����
		//�̷��� ���������ڸ� default, ���� �����ڶ���Ѵ�.
		//default��� Ű����� ����ؼ��� �ȵȴ�.
		//default ���� �����ڴ� ���� ��Ű���� �ִ� Ŭ���������� ������ ���
		//protected���� �Ѵܰ� �� ��ٷο�(�� ��Ӱ��迡 �־, ���� ��Ű���� �ƴ϶�� ���� �Ұ���)
		//num is not public in Account, cannot be accessed from outside package
		//�����Ǿ� ���� �����Ƿ� �ܺο��� ������ �Ұ����ϴ�.
		//System.out.println(acc.num);
		//�츮�� ���ݱ��� �ǽ��ߴ� ��� Ŭ������ ��� default����, �츮�� ���� ���丮����
		//�ǽ��� �ؿԱ� ������ ���ݱ��� �̷� ������ ������ �ʾҴ� �� ���̴�.

		//���� �ܾ� balance�� �׽�Ʈ
		//balance�� ���� ������ ������������ private�� ����Ǿ����Ƿ�, AccountŬ���� ������
		//�� ������ ���� ,���� �츮�� Account �ڽ��� �ƴ϶� ���� ���Ұ�
		//���� �����....
		//System.out.println(acc.balance);//�������ϸ� ����
		//balance has private access in Account(private ���������ڰ� ����Ǿ� �ִ�)
		
		//private�� �ʹ� �����ؼ� �ƹ��� �����µ� �׷� �� �����???
		//acc.balance = 10; //�� ����� ���� �����̹Ƿ� �Ұ���
		acc.setBalance(10);//10������ ����. �� ����� �޼��带 ���� �����̹Ƿ� ����
		System.out.println(acc.getBalance());
	
		Customer c1 = new Customer();
		c1.setName("�¿�");
		c1.setAge(25);
		c1.setIsMarry(false);
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getIsMarry());
	}
}
