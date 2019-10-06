
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;

import java.io.FileReader;

import static org.hamcrest.Matchers.notNullValue;

public class CreateProductsTest {
    ClassLoader classLoader = getClass().getClassLoader();
    String resource = classLoader.getResource("products.json").getPath();
    JSONParser parser = new JSONParser();
    Object obj;
    {
        try {
            obj = parser.parse(new FileReader(resource));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    JSONObject productData = (JSONObject) obj;


    @Test
    public void shouldPostANewProduct(){
        RequestSpecification REQUEST = RestAssured.given().contentType(ContentType.JSON).log().all();
        REQUEST.body(productData);
        Response response = REQUEST.baseUri("http://localhost:3030").post("/products");
        response.then().statusCode(201).body("id", notNullValue());
    }
    @Test
    public void shouldGetProductById(){
        RequestSpecification REQUEST = RestAssured.given().contentType(ContentType.JSON).log().all();
        REQUEST.baseUri("http://localhost:3030").get("/products/7425383").then().statusCode(200);
    }

    @Test
    public void shouldGet404IfProductDoesNotExist(){
        RequestSpecification REQUEST = RestAssured.given().contentType(ContentType.JSON).log().all();
        REQUEST.baseUri("http://localhost:3030").get("/products/0000").then().statusCode(404);
    }
}