package homework;

public class Four_wheelers implements Vehicle{
	public int getCost() {
		System.out.println("This gives deatils about Four Wheelers");
		System.out.println("\nThe cost of vehicle is:");
		return 1500000;
		
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		System.out.println("The speed of vehicle is :");
		return 200;
	}
	

}
