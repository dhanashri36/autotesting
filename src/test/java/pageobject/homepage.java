package pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;

import selenium.SeleniumClass;

public class homepage extends SeleniumClass {
	WebElement element;
	String xpathHomePageLniks = "//li/a";
	
	List<WebElement> elements;
	
	public void clickLinkOnHomePage(String linkAddress){
	element = super.identifyElement("linktext", linkAddress);
	super.clickElement(element);
		
	}
	
	public void verifyAllLinks() {
		elements = super.identifyElements("xpath", xpathHomePageLniks);
		int count=elements.size();
		
		assert count ==39 : count + "is not equal to 39";
		
		
	}
	
	public void clickHomePageLink(String linkAddress) {
		element= super.identifyElement("linktext", linkAddress);
		element.click();
	}
}
