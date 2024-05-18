package TestN;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {
	
//alwaysRan - true (when TestNG skips execution of a Test case for whatever reason, and you want diat Test Case to execute then we use alwaysRun = thie)

	@Test(priority =1 )
public void Begin() {
	System.out.print("This is the initial test case");			
	Assert.fail("This test case we fail");
	}
						

	@Test(priority =2 ,dependsOnMethods ="Begin", alwaysRun = true)
 public void Ready() {
	System.out.print("This is the next test case");

}

@Test(priority =3 ,dependsOnMethods = {"Begin","Ready"},alwaysRun = true )
public void Steady() {
	System.out.print("This is the next sequens test case");

 }

@Test(priority =4 ,dependsOnMethods ={"Begin","Ready","Steady"},alwaysRun = true , enabled = false )
public void Go() {
	System.out.println("This is the next lavel test case");
}
}
