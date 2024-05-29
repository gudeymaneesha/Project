package org.parallel;

import org.practiceTestng.BaseClassOfTestNG;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Omr extends BaseClassOfTestNG {
	
	@Test
	private void login1() {
		browserLaunch("CHROME");
		enterAppUrl("https://omrbranch.com/");
		maximizewindow();
		implicitwait(30);
		elementSendKeys(findLocatorByName("email"), "maneeshamanu474@gmail.com");
		elementSendKeys(findLocatorByName("pass"), "Lohansh@21");
		elementClick(findLocatorByXpath("//button[@type='submit']"));

	}
}
