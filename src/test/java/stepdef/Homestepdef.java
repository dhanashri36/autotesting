package stepdef;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobject.homepage;

public class Homestepdef extends homepage {
	
	homepage hp = new homepage();
	
	
	@Given("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		hp.clickHomePageLink(arg1);
	}

	
	@Given("^Launch browser \"([^\"]*)\"$")
	public void launch_Launch_browser(String arg1){
	    // Write code here that turns the phrase above into concrete actions
	   hp.launchedbrowser(arg1);
	}

	@Given("^verify \"([^\"]*)\" page$")
	public void verify_page(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		hp.verifypageURL(arg1);
			   
	}
	@Given("^launch url \"([^\"]*)\"$")
	public void launch_url(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	   hp.launchedApplication(arg1);
	}
	
	
	
	@After
	@Given("^close browser$")
	public void close_browser()   {
	    // Write code here that turns the phrase above into concrete actions
		
		
	    hp.getclosebrowser();
	}

	@Given("^verify all links on home page$")
	public void verify_all_links_on_home_page()  {
	    // Write code here that turns the phrase above into concrete actions
	    hp.verifyAllLinks();
	}
}
