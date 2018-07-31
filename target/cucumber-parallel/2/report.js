$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/usachary/Documents/cucumberadvanced/src/test/resources/features/Registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration",
  "description": "As a user\nI need to regigser to guru99\nso that I am successfully login to the system",
  "id": "registration",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "",
  "id": "registration;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I navigate to the registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I attempt to register with user details",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the registration is sucessfull",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.given_i_navigate_to_the_registration_page()"
});
formatter.result({
  "duration": 304241786,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.when_i_attempt_to_register_with_user_details()"
});
formatter.result({
  "duration": 82840,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.then_the_registration_is_sucessfull()"
});
formatter.result({
  "duration": 72639,
  "status": "passed"
});
});