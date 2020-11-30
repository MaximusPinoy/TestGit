package exceptionTest;

public class ExceptionHandlingTest {
	//https://www.tutorialspoint.com/java/java_exceptions.htm
	public static void main(String[] args) {
		try {
			System.out.println("Start successfull");
			//this is the cause of exception
			int iError = 1/0;
			System.out.println("End completed");	
			
		} catch (Exception e) {
			System.out.println("Cause is "+e.getCause());
			System.out.println("Message is "+e.getMessage());
			e.printStackTrace();
			
		} 
		
	}

}
