package practice3.model.vo;

public class Rabbit {
	private int weight;
	private String color;
	
	
	public int getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public Rabbit(int weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}

	@Override
	public void speak() {
		System.out.println(super.toString() + " " + weight + "kg 이며, 색상은 " + color + " 입니다.");
	}

}
}
