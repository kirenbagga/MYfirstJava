package pack;

public class Object3 extends Object2{
	public int pinCode;

	public Object3(String name, int age, String place,int pinCode) {
		super(name, age, place);
		this.pinCode=pinCode;
	}
	public void data() {
		System.out.println("Iam "+ name +", age is "+ age + " year old and place is "+ place +" pin is "+ pinCode);
	}

}
