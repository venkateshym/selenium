package pack;

import org.testng.annotations.Test;
	//personal loan
public class Testng22 {
		@Test(groups={"1st"})
		public void Method4(){
			System.out.println("Personal Loan 1");	
		}
		@Test(enabled="false")
		public void Method25(){
			System.out.println("personal loan for spec 2");	
		}
}


	