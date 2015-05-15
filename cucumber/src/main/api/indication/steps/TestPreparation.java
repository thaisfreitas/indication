package indication.steps;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.parsing.Parser;
import cucumber.api.java.Before;

import java.net.UnknownHostException;

public class TestPreparation {

    @Before
    public void setUp() throws UnknownHostException {
        RestAssured.reset();

//        RestAssured.baseURI = "http://localhost";
        RestAssured.baseURI = "http://www.google.com";
        RestAssured.port = Integer.parseInt("8080");
        RestAssured.defaultParser = Parser.JSON;
    }
}
