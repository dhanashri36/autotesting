package stepdef;

import cucumber.api.java.en.Given;
import pageobject.FormAuthenticationPage;

public class FormStepdef {

	
	FormAuthenticationPage hp = new  FormAuthenticationPage();
	
	
	@Given("^enetr \"([^\"]*)\" as username$")
	public void enetr_as_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    	hp.passUserName(arg1);
	}


	@Given("^enter \"([^\"]*)\" as password$")
	public void enter_as_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    hp.passPassword(arg1);
	}

	@Given("^click on login button$")
	public void click_on_login_button()  {
	    // Write code here that turns the phrase above into concrete actions
	    hp.clickLoginButton();
	}

	@Given("^click on logout button$")
	public void click_on_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	   hp.clickLogOutButton();
	}


}
