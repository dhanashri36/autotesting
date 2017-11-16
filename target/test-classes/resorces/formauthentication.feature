Feature: login Functionalty

Background:
* Launch browser "firefox"
* launch url "https://the-internet.herokuapp.com/"
* verify "https://the-internet.herokuapp.com/" page

@fa
Scenario: to verify login functiobality with correct credentials
* click on "Form Authentication" link
* verify "https://the-internet.herokuapp.com/login" page
* enetr "tomsmith" as username
* enter "SuperSecretPassword!" as password
* click on login button
* verify "https://the-internet.herokuapp.com/secure" page
* click on logout button
* verify "https://the-internet.herokuapp.com/login" page


