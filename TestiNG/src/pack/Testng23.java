package pack;

import org.testng.annotations.Test;
	//Car Loan
public class Testng23 {
		@Test(dependsOnMethods={"Methods25","Rev"})
		public void Methods4(){
			System.out.println("Car Loan 3 - 1");	
		}
		@Test
		public void Methods25(){
			System.out.println("Car Loan 4 - 2");	
		}
		@Test
		public void Rev(){
			System.out.println("Car Loan 5 - 3");	
		}
}


