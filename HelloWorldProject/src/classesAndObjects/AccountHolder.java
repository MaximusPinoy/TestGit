package classesAndObjects;

public class AccountHolder {
	String firstName;
	String lastName;
	int age;
	float accountBalance;
	boolean eligibleForCreditCard;
	
	public void qualifiedForCreditCard() {
		if (age >=25 && accountBalance >=1000)
			eligibleForCreditCard=true;
			
	}
	

}
