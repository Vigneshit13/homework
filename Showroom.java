package homework;

public class Showroom {
	public static void main(String[] args) {
		Two_wheelers obj1=new Two_wheelers();
		System.out.println(obj1.getCost());
		System.out.println(obj1.getSpeed());
		Three_wheelers obj2 = new Three_wheelers();
		System.out.println(obj2.getCost());
		System.out.println(obj2.getSpeed());
		
		Four_wheelers obj3 = new Four_wheelers();
		System.out.println(obj3.getCost());
		System.out.println(obj3.getSpeed());
		
	}

}
