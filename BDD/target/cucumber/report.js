$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "User Login",
  "description": "  Existing user should be able to login stackoverflow using correct credentials",
  "id": "user-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8713442977,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login into account with correct credentials",
  "description": "",
  "id": "user-login;login-into-account-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User navigates to stackoverflow Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks login button on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters valid username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters valid password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be taken to successful login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_navigates_to_stackoverflow_Website()"
});
formatter.result({
  "duration": 10412945554,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_login_button_on_homepage()"
});
formatter.result({
  "duration": 1532795560,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_enters_valid_username()"
});
formatter.result({
  "duration": 403170973,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_enters_valid_password()"
});
formatter.result({
  "duration": 216785594,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 170798576,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_should_be_taken_to_successful_login_page()"
});
formatter.result({
  "duration": 39847,
  "status": "passed"
});
});