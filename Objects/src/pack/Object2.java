package pack;

class Object2 {
public String name;
public int age;
public String place;
public Object2(String name, int age, String place) {
	this.name=name;
	this.age=age;
	this.place=place;
	add2();
}
public void data() {
	System.out.println("Iam "+ name +", age is "+ age + " year old and place is "+ place );
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return this.name;
	
}
private void add2() {
	System.out.println("privte method example");
}
}

