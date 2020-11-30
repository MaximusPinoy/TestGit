package statesAndBehaviors;

public class Puppy {
	   public Puppy(String name) {
	      // This constructor has one parameter, name.
	      System.out.println("Passed Name is :" + name );
	   }
	   public Puppy(int age) {
		      // This constructor has one parameter, name.
		      System.out.println("Passed Age is :" + age );
		   }
	   

	   public static void main(String []args) {
	      // Following statement would create an object myPuppy
	      Puppy myPuppy = new Puppy( "tommy" );
	      Puppy myPuppyAge = new Puppy(3 );
	      
	   }
	}