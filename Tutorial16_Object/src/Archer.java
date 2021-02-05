
public class Archer {
	
	String name;
	String power;
	
	public Archer(String name, String power) {
		this.name = name;
		this.power = power;
	}
	
	// 암묵적으로 Object 클래스의 상속을 받는다!
	public boolean equals(Object obj) {
		Archer temp = (Archer) obj;
		if(name == temp.name && power == temp.power) {
			return true;
		}
		else
		{
			return false;
		}
	}
}
