package statesAndBehaviors;

public class HumanAndDog {
	String bread;
	String nationality;
	static boolean animal = true;
	static boolean human = true;
	
	static void barking() {
		System.out.println("Aw aw aw");
	}
	
	static void talking () {
		System.out.println("Hello! How are you?");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanAndDog person = new HumanAndDog();
		HumanAndDog dog = new HumanAndDog();
		
		dog.bread = "dachshund";
		person.nationality = "Filipino";
		if (animal) {
			System.out.print("I'm a "+dog.bread+" ");
			barking();
		} 
		
		if (human) {
			System.out.println("I'm a "+person.nationality);
			talking();
		}
		
		
		
		
		

	}

}
