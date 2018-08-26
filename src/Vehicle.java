
public interface Vehicle {
	
	default void print() {
		System.out.println("It is a vehicle");
	}
	
	public String listFeatures();

}
