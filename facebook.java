package org.parallel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.practiceTestng.BaseClassOfTestNG;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class facebook extends BaseClassOfTestNG {

	@Test
	private void login() {
		browserLaunch("CHROME");
		enterAppUrl("https://www.facebook.com/");
		maximizewindow();
		implicitwait(30);
		elementSendKeys(findLocatorByXpath("//input[@type='text']"), "maneesamanu234@gmail.com");
		elementSendKeys(findLocatorByXpath("//input[@type='password']"), "Lhansh@21");
		elementClick(findLocatorByName("login"));
	}

}
