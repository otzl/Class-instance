
public class Student_class {

	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;
	
	public Student_class(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	public void show() {
		System.out.println(name + "�� �ȳ��ϼ���.");
		System.out.println("[ " + number + ", " + age + "�� ]");
		System.out.println(name + "���� Java ������ " + scoreJava + "�� �Դϴ�.");
		System.out.println(name + "���� Web ������ " + scoreWeb + "�� �Դϴ�." );
		System.out.println(name + "���� Android ������ " + scoreAndroid + "�� �Դϴ�.");
	
}
	
}
