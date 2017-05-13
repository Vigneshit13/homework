package homework;

public class Two_wheelers implements Vehicle{
	public int getCost() {
		System.out.println("This gives deatils about Two Wheelers");
		System.out.println("\nThe cost of vehicle is:");
		return 100000;
		
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		System.out.println("The speed of vehicle is :");
		return 120;
	}
	

}
