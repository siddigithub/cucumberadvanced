$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/usachary/Documents/cucumberadvanced/src/test/resources/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "As a user\nI need to login to guru99\nso that I am successfully login to the system",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "",
  "id": "login;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I attempt to login with username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can see the welcome screen",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.given_i_navigate_to_the_login_page()"
});
formatter.result({
  "duration": 9739694757,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.when_i_lgin_with_username_and_password()"
});
formatter.result({
  "duration": 80908,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.then_i_can_see_the_welcome_screen()"
});
formatter.result({
  "duration": 312607836,
  "status": "passed"
});
});