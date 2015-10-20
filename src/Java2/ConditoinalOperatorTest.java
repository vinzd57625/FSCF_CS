package Java2;

public class ConditoinalOperatorTest {

	public static void main(String[] args) {
	
	int numPets = 4;
		String petStatus = (numPets<4)? "Within Limit": "Exceeded Limit"; // (Boolean expression) ? value to assign if true : value to assign if false
		
		System.out.println("the pet status is: " + petStatus);

	}

}
