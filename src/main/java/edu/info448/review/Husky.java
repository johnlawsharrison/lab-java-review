package edu.info448.review;

public class Husky extends Dog implements Huggable {
	
	public Husky(String name) {
		super(name, "Husky");
	}

	public void pullSled() {
		System.out.println(this + " is pulling a sled!");
	}

	public void bark() {
		System.out.println(this + "says: Woof!");
	}

	public void hug() {
		System.out.println(this + "hugs you!")
	}
}