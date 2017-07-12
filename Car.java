
public class Car {
	String name;
	String color;
	String model;
	
	Car(String n, String c, String m)
	{
		name=n;
		color=c;
		model=m;
				
	}
	public static void main(String[] args)
	{
		Car c1 = new Car("A5", "RED","AUDI");
		Car c2 = new Car("A6", "RED","AUDI");
		System.out.println(c1.compare(c2));
		
		System.out.println();
	}
	private char[] compare(Car c2) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", model=" + model + "]";
	}
	
}