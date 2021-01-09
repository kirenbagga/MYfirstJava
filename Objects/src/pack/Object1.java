package pack;

public class Object1 {
	public static void main(String[] args) {
		Object2 obj=new Object2("kire",3,"tpt");
		obj.data();
		obj.setName("bagg");
		String x=obj.getName();
		System.out.println(x);
		obj.data();
		
		Object3 obj3=new Object3("kie",3,"trdgdt",2324);
		obj3.data();
		
		Object4 obj4=new Object4(9, "ask");
		obj4.dispaly2();
		Object4.display();
	}

}
