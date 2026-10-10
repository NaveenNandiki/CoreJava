package com.Labprograms.classes;

class Parent {
	int x = 10;

	Parent() {
		show();
	}

	void show() {
		System.out.println("Parent " + x);
	}
}

class Child extends Parent {
	int x = 20;

	Child() {
		show();
	}

	void show() {
		System.out.println("Child " + x);
	}
}

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Child();
	}

}

//class Parent {
//
//}
//
//class Child extends Parent {
//
//}
//
//public class Test {
//
//	static void show(Object o) {
//		System.out.println("Object");
//	}
//
//	static void show(Parent p) {
//		System.out.println("Parent");
//	}
//
//	static void show(Child c) {
//		System.out.println("Child");
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		show(null);
//	}
//
//}
