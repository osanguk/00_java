import java.util.Scanner;

public class VariableScan {

	public static void main(String[] args) {
		
		//����ڿ��� �Է¹��� ������ ����
		//Scanner�� �̿��ؼ� �Է¹��� ������ ��ǻ�Ϳ� ǥ������
		//System.in ����Ͽ� Ű���� �Է��� �о�ö� ���
		//Scanner �ڷ��� �ڸ��� int�� String�̳� �Ǽ� boolean����
		//Ȯ����� ��Ÿ�� �� ���� ������ �ʱ⿡�� Scanner��� ���
		//nextLine() :���� �Ǵ� ���͸� ġ�������� ���� ��ü�� �Է� �޴´�.
		//�Էµ� ���ڸ� ��� �� �����´�.(����,Ư������ �� ��� ������)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������� �̸��� �Է��ϼ��� :" );
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.print("������� ��� ���� �Է��ϼ���:");
		String  live = sc.nextLine();
		System.out.println(live);
		
		System.out.print("������� �ڵ�����ȣ�� �Է��ϼ���:");
		String phoneNumber = sc.nextLine();
		System.out.println(phoneNumber);
		
		//Scanner String�� ����ؼ�
		//������� Ű,����,�г����� �Է¹ޱ�
		
		//������� Ű String height
		//������� ���� String age
		//������� �г��� String nickName
		System.out.print("������� Ű��?:");
		String height = sc.nextLine();
		System.out.println(height);
		
		System.out.print("������� ���̴�?:");
		String age = sc.nextLine();
		System.out.println(age);
		
		System.out.print("������� �г��Ӵ�?:");
		String nickname = sc.nextLine();
		System.out.println(nickname);

	}

}
