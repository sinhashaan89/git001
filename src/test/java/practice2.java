

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class practice2 {
	@Test
	public void Practice105(){
		String url = System.getProperty("URL");
		System.out.println("This is my browser"+url);
		Reporter.log("This is method of maven for practice2,Practice10",true);
	}
	@Test
	public void Practice203(){
		Reporter.log("This is method of maven for practice2,Practice20",true);
	}
	public void Practice406() {
		Reporter.log("This is method of maven for practice2,Practice40",true);
	}
	@Test
	public void Practice301(){
		Reporter.log("This is method of maven for practice2,Practice30",true);
	}
	@Test
	public void Practice396(){
		Reporter.log("This is method of maven for practice2,Practice30",true);
	}
	

}
