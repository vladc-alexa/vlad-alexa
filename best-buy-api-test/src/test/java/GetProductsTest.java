import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class GetProductsTest {
    @Test
    public void shouldGetAllProducts(){
        RequestSpecification REQUEST = RestAssured.given().contentType(ContentType.JSON).log().all();
        REQUEST.baseUri("http://localhost:3030").get("/products").then().statusCode(200);
    }
    @Test
    public void shouldGetProductById(){
        RequestSpecification REQUEST = RestAssured.given().contentType(ContentType.JSON).log().all();
        REQUEST.baseUri("http://localhost:3030").get("/products/9999685").then().statusCode(200);
    }

    @Test
    public void shouldGet404IfProductDoesNotExist(){
        RequestSpecification REQUEST = RestAssured.given().contentType(ContentType.JSON).log().all();
        REQUEST.baseUri("http://localhost:3030").get("/products/0000").then().statusCode(404);
    }
}
