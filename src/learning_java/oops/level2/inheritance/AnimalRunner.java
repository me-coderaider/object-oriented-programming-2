package learning_java.oops.level2.inheritance;

abstract class Animal{
	abstract void bark();
}

class Dog extends Animal{
	public void bark() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal{
	public void bark() {
		System.out.println("Meow Meow");
	}
}

public class AnimalRunner {
	
	public static void main(String[] args) {
		Animal[] animals= {new Dog(), new Cat()};
		
		for(Animal animal:animals) {
			animal.bark();
		}
	}
}
