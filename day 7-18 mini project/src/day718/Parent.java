package day718;

public abstract class Parent {
	int num;  // 일반 변수도 존재 가능
	public void normal() {
		System.out.println("일반 메소드 존재 가능");
	}
	public abstract void f();
}
