package practice3.model.vo;

public class Dog extends Animal{
//필드	
	public static final String PLACE = "애견카페";
	private int weight;
	
public void setWeight(int weight) {
		this.weight = weight;
	}
	//메서드
	//Setter
	//Getter
	public int getWeight() {
		return weight;
	}
	

	public Dog(String name, String kinds,int weight) {
		super(name,kinds);
		this.weight=weight;
		
	}
	public void speak() {
		System.out.println(super.toString() + "몸무게는" + weight + "kg 입니다.");
	}
}
