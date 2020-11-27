$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login_test.feature");
formatter.feature({
  "id": "login-action",
  "description": "",
  "name": "Login Action",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "login-action;successful-login-with-valid-credentials",
  "tags": [
    {
      "name": "@regression",
      "line": 2
    },
    {
      "name": "@login",
      "line": 3
    }
  ],
  "description": "",
  "name": "Successful Login with Valid Credentials",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "User Navigate to LogIn Page",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "User enters Credentials to LogIn",
  "keyword": "And ",
  "line": 7,
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 8
    },
    {
      "cells": [
        "pathmanaban.govindhan1984@gmail.com",
        "testing"
      ],
      "line": 9
    }
  ]
});
formatter.step({
  "name": "Message displayed Login Successfully",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "location": "Test_Steps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 8264378200,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 6013434000,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_enters_Credentials_to_LogIn(Credentials\u003e)"
});
formatter.result({
  "duration": 10970844000,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 940481400,
  "status": "passed"
});
formatter.uri("service_test.feature");
formatter.feature({
  "id": "service-testing",
  "description": "",
  "name": "Service testing",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "service-testing;test-webdervice",
  "tags": [
    {
      "name": "@regression",
      "line": 2
    },
    {
      "name": "@service",
      "line": 3
    }
  ],
  "description": "",
  "name": "Test webdervice",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "User in Google API page",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "User perform get method",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "retrieve places",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "Service_test.user_in_Google_API_page()"
});
formatter.result({
  "duration": 2580788400,
  "status": "passed"
});
formatter.match({
  "location": "Service_test.user_perform_get_method()"
});
formatter.result({
  "duration": 18300,
  "status": "passed"
});
formatter.match({
  "location": "Service_test.retrieve_places()"
});
formatter.result({
  "duration": 21300,
  "status": "passed"
});
});