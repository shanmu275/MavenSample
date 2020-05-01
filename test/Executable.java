package org.test;

public class Executable extends BaseClass {
	public static void main(String[] args) {
		openBrowser();
		LoadUrl("https://www.facebook.com/");
		PageTitle();
		PageUrl();

		LoginPojo l=new LoginPojo();
		fill(l.getTxtEmail(), "mvshanmu");
		fill(l.getTxtPass(), "shanmugam");

		driver.navigate().refresh();

		LoginPojo l1=new LoginPojo();
		fill(l1.getTxtEmail(), "manoj");
		fill(l1.getTxtPass(), "Greens");

		driver.navigate().refresh();
		
		LoginPojo l2=new LoginPojo();
		fill(l2.getTxtEmail(), "Arun");
		fill(l2.getTxtPass(), "Tech");
	}
}
