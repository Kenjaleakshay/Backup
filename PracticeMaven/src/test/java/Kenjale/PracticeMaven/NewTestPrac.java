package Kenjale.PracticeMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestPrac {
  @Test
  public void scenario() {
	  System.out.println("Scenario executed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method executed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method executed");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class executed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test executed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test executed");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite executed");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite executed");
  }
  
  @BeforeGroups
  public void beforegroups() {
	  System.out.println("After suite executed");
  }
  
  @AfterGroups
  public void aftergroups() {
	  System.out.println("After suite executed");
  }

}
