package pack;

public class Object4 {
public static int count=0;
public int age;
public String name;
/**
 * @param age
 * @param name
 */
public Object4(int age, String name) {
	super();
	this.age = age;
	this.name = name;
	Object4.count +=1;
}
public static void display() {
	System.out.println("dispaly4");
}
public void dispaly2() {
	System.out.println("dispaly4 without static");
}

}
