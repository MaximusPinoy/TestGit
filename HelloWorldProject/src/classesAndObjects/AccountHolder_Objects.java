package classesAndObjects;

public class AccountHolder_Objects {
	public static void main(String[] args) {
		AccountHolder tom = new AccountHolder();
		
		tom.age=25;
		tom.accountBalance=1999;
		tom.qualifiedForCreditCard();
		System.out.println(tom.eligibleForCreditCard);
		
	}

}
