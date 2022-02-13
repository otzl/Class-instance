package Address;

import java.util.ArrayList;
import java.util.Scanner;

public class Addressmain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Address> addressList = new ArrayList<Address>();
 
		while (true) {
			System.out.println("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >>");
			int num = sc.nextInt();

			if (num == 1) {
				// 전화번호부(addressList)에 값을 추가시키고 싶음
				// 이름, 나이, 전화번호를 입력받아서 -> 객체로 만들어서
				// addressList 추가 시키면됨
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 :");
				String phoneNum = sc.next();
				Address list = new Address(name, age, phoneNum);
				addressList.add(list);

			} else if (num == 2) {
				for (int i = 0; i < addressList.size(); i++) {
					addressList.get(i).show();
				}
				if (addressList.size() == 0) {
					System.out.println("연락처가 없습니다.");
				}
			} else if (num == 3) {
				for (int i = 0; i < addressList.size(); i++) {
					System.out.print((i + 1) + ". ");
					addressList.get(i).show();
				}
				System.out.print("삭제할 번호를 입력하세요>> ");
				int input = sc.nextInt();
				addressList.remove(input - 1);
				for (int i = 0; i < addressList.size(); i++) {
					addressList.get(i).show();
				}
			} else if (num == 4) {
				System.out.print("검색할 이름을 입력하세요>> ");
				String nameSearch = sc.next();
				for (int i = 0; i < addressList.size(); i++) {
					if (addressList.get(i).getName().equals(nameSearch)){
						addressList.get(i).show();
					}
				}
			} else if (num == 5) {
				System.out.println("프로그램 종료");
				break;
			}

		}
	}
}
