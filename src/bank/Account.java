package bank;

/*���� ���¸� �����Ѵ�: ������ ��������... ������ �����͸� ���� �ٷ�*/
//��Ű���� ���� Ŭ������ public���� �������� ������, �ٸ� ��� Ŭ������
//�� Ŭ������ ����� �� ����. �̰� ������ �ƴ϶� �׳� �ǹ̾��� ��...
//Ŭ������ ����� ����� ���̱� ������ public���� �����ϵ�, �� ���� ����鿡 ����
//���� ó�� �ϸ� ��!!
public class Account{
	public String bank = "�������";//�����
	protected String customer;//���̸�
	String num = "022-388-85465";//���¹�ȣ
	private int balance = 100000;//�ݾ�

	//private���� ����� ������ ���� �ƹ��� �ܺο��� ������ �� �����Ƿ�
	//������ �����Ϸ���, �޼��带 �̿��ؾ��Ѵ�.
	//�Ʒ��� �޼���� public�̹Ƿ� ��� ��ü�� ������ �� �ִ�.

	//�̿� ���� setBalnceó�� private������ ���� �����ϴ� �޼��带 ������ setter�� �Ѵ�.
	public void setBalance(int balance){
		this.balance = balance;
	}

	//�̿� ���� private���� ����� ������ ���� �����ϴ� �޼��带 ������ getter�� �Ѵ�.

	public int getBalance(){
		return this.balance;
	}

}
