package Address;

import java.util.ArrayList;
import java.util.Scanner;

public class Addressmain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Address> addressList = new ArrayList<Address>();

		while (true) {
			System.out.println("[1]�߰� [2]��ü��ȸ [3]���� [4]�˻� [5]���� >>");
			int num = sc.nextInt();

			if (num == 1) {
				// ��ȭ��ȣ��(addressList)�� ���� �߰���Ű�� ����
				// �̸�, ����, ��ȭ��ȣ�� �Է¹޾Ƽ� -> ��ü�� ����
				// addressList �߰� ��Ű���
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("��ȭ��ȣ :");
				String phoneNum = sc.next();
				Address list = new Address(name, age, phoneNum);
				addressList.add(list);

			} else if (num == 2) {
				for (int i = 0; i < addressList.size(); i++) {
					addressList.get(i).show();
				}
				if (addressList.size() == 0) {
					System.out.println("����ó�� �����ϴ�.");
				}
			} else if (num == 3) {
				for (int i = 0; i < addressList.size(); i++) {
					System.out.print((i + 1) + ". ");
					addressList.get(i).show();
				}
				System.out.print("������ ��ȣ�� �Է��ϼ���>> ");
				int input = sc.nextInt();
				addressList.remove(input - 1);
				for (int i = 0; i < addressList.size(); i++) {
					addressList.get(i).show();
				}
			} else if (num == 4) {
				System.out.print("�˻��� �̸��� �Է��ϼ���>> ");
				String nameSearch = sc.next();
				for (int i = 0; i < addressList.size(); i++) {
					if (addressList.get(i).getName().equals(nameSearch)){
						addressList.get(i).show();
					}
				}
			} else if (num == 5) {
				System.out.println("���α׷� ����");
				break;
			}

		}
	}
}
