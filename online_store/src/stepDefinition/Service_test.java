package stepDefinition;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.List;
import java.util.concurrent.TimeUnit;









import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonValue;





import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class Service_test {
	//public static WebDriver driver;
	

@Given("^User in Google API page$")
public void user_in_Google_API_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	
    //Get method
	/*RestAssured.baseURI="http://216.10.245.166";
	
	Response res=given().
	//Parameters name
	param("AuthorName","somename").
	//param("key","AIzaSyAQZ-_zMNtAgd0QpWE7S_biu_4_cTzf7fg").
	when().
	//Resource name
	get("/Library/GetBook.php").
	then().extract().response();
	       
	String response=res.asString();
	int code=res.statusCode();

	System.out.println(code);
	System.out.println("response"+response);
	response="["+response+"]";*/
	    
	//Validating Response
	/*JSONArray jsonArrayResponseBody;
	jsonArrayResponseBody=new JSONArray(response);
	
	JSONObject message=jsonArrayResponseBody.getJSONObject(0);
	System.out.println("JSON Object: "+message);
	JSONArray places = (JSONArray)message.get("results");
	
	//String placeid=message.getString("Place_id");
	System.out.println("PLACE : "+places);
	
	for (int i = 0; i < places.length(); i++) {
	    JSONObject jsonobject = places.getJSONObject(i);
	    String name = jsonobject.getString("place_id");
	    System.out.println("PLACE:     "+name);*/
	    
	    //String url = jsonobject.getString("url");
	//}
	
	//POST Method
	String isbn="{\n" +
	           "   \"book_name\":\"text\",\n" +  "   }\n" +
	           "   \"isbn\":\"12232335\",\n" +  "   }\n" +
	           "   \"aisle\":\"12233\",\n" +  "   }\n" +
	           "}";;
	String aisle;
	RestAssured.baseURI="http://216.10.245.166";
	
	RequestSpecification request=RestAssured.given();
	Response resp=request.body(isbn).when().
	post("/Library/Addbook.php").
	then().extract().response();
	
	String s=resp.asString();
	int code=resp.statusCode();

	System.out.println(code);
	System.out.println(s);
	
	 //PUT Method
	/*String isbn="{\n" +
				  "   \"book_name\":\"text\",\n" +  "   }\n" +
		           "   \"isbn\":\"12232335\",\n" +  "   }\n" +
		           "   \"aisle\":\"12233\",\n" +  "   }\n" +
		          "}";
	String aisle;
	RestAssured.baseURI="http://216.10.245.166";
	RequestSpecification request=RestAssured.given();

	Response resp=request.body(isbn).
	//.param("key", "qaclick123").
	when().

	put("/Library/Putbook.php").

	then().extract().response();
	String s=resp.asString();
	int code=resp.statusCode();

	System.out.println(code);
	System.out.println(s);*/
		
	//Delete
	/*String isbn="{\n" +
					  "   \"book_name\":\"text\",\n" +  "   }\n" +
			     "}";
	String aisle;
	RestAssured.baseURI="http://216.10.245.166";
	RequestSpecification request=RestAssured.given();
	
	Response resp=request.body("").
	//Response resp=request.
    //.param("key", "qaclick123").
	when().delete("/Library/UpdateBook.php").then().extract().response();
	String s=resp.asString();
	int code=resp.statusCode();

	System.out.println(code);
	System.out.println(s);*/
}


@When("^User perform get method$")
public void user_perform_get_method() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Then("^retrieve places$")
public void retrieve_places() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}


	

}
