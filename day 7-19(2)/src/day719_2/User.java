package day719_2;

public class User {
	private String id;
	private String pw;
	private String name;
	private int age;
	
	
	// .getId() --> .id
	// .setId("��") --> .id = "��"
	
	// ȸ�� ������ �����ִ� �޼ҵ�
	public void show() {
		System.out.println("----" + this.id + "����----");
		System.out.println("�̸� : " + this.name);
		System.out.println("��й�ȣ : " + this.pw);
		System.out.println("���� : " + this.age);
		System.out.println("----------");
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
		
		
		
		
	}
}
