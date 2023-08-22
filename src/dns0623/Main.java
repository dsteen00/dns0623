package dns0623;

public class Main {

	public static void main(String[] args) {
		
		boolean looper = false;
		while(!looper) {
			RentalStore DerrickStore = new RentalStore();
			looper = DerrickStore.runStore();
		}
	}

}
