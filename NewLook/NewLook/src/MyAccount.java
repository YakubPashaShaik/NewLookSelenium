//package com.example.tests;

import com.thoughtworks.selenium.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("deprecation")

/**
 * 
 * @author salhawi
 * 
 * This is a test to ensure that log in works from the homepage. Verification of the 'sign out' button on the homepage is also done.
 * 
 */
public class MyAccount extends SeleneseTestCase {
	private Selenium selenium;
	
	/**
	 * This opens up the browser using the browser and URL specified. The window is then maximised.
	 */
	
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://m.newlook.com/mcs/publish/2559/28551");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
	}
	
	/**
	 * 
	 * This loads the 'MY ACCOUNT' link on the homepage and enters the login details 'veltisqa@gmail.com, velti123'. It then checks each of the areas
	 * on the my account page. User is then signed out.
	 */
	
	@Test
	public void testNLTestTwo() throws Exception {
		selenium.open("/mcs/publish/2559/28551");
		selenium.click("link=MY ACCOUNT");
		selenium.waitForPageToLoad("30000");
		selenium.type("name=email", "veltisqa@gmail.com");
		selenium.type("name=password", "velti123");
		selenium.click("css=input[name=\"Submit Button_63424_\"]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=MY PERSONAL DETAILS");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=MY ADDRESSES");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=MY CARDS");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=MY ORDERS");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=input[name=\"Submit Button_63319_\"]");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=input[name=\"Submit Button_63319_\"]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Sign In");
		selenium.waitForPageToLoad("30000");
		selenium.type("name=email", "veltisqa@gmail.com");
		selenium.type("name=password", "velti123");
		selenium.click("css=input[name=\"Submit Button_63424_\"]");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=Sign Out")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("css=img[alt=\"*\"]")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.open("/mcs/publish/2559/28564");
		verifyTrue(selenium.isElementPresent("link=Sign Out"));
		verifyTrue(selenium.isElementPresent("link=Sign Out"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}



