package vn.com.nguacon.springcore.beans.inheritance;

public class Cat {
	private String name;
	private String color;

	public void say() {
		System.out.println("My name is " + getName() + " , my color is " + color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
