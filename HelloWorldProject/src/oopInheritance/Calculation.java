package oopInheritance;

class Calculation {
	   int z;
		
	   public void addition(int x, int y) {
	      z = x + y;
	      System.out.println("The sum of the given numbers:" + x + "+"+ y + "="+z);
	   }
	   
	   public static void static_addition() {
	      System.out.println("Static super class method");
		   }
		
	   public void Subtraction(int x, int y) {
	      z = x - y;
	      System.out.println("The difference between the given numbers:" + x + "-"+ y + "="+z);
	   }
	}