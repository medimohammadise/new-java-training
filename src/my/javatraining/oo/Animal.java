package my.javatraining.oo;

public class Animal {
	protected void eat() {
		System.out.println("Animal is eating");
	}

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		Animal hourse = new Hourse();
		hourse.eat();
		animal.buck();
		animal.test(new int[] {1,2});
	}

	protected static void testMethod() {
		System.out.println("This is static");
	}

	void buck() {
		System.out.println("hourse is bucking");
	}
	void test(int...x) {
		for (int i : x) {
			System.out.println(i);
		}
	}

}
