import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;

public class AddBoard {
    RequestSpecification httpRequest;
    Response response;


    public AddBoard(String URI){
        RestAssured.baseURI = URI;
        httpRequest = RestAssured.given();
    }


    public void AddQueriesPara(String name , String idOrganization) {
        httpRequest.queryParam("name", name);
        httpRequest.queryParam("idOrganization", idOrganization);
        httpRequest.queryParam("key", "24add5103583a8a3b0a4f0fc6373e478");
        httpRequest.queryParam("token", "c92e3263bcda70d4a0b94870a1eb76bae8d5c404ab80cafc5b91f6b32d3ec51a");
    }



    public void AddHeaders() {
        httpRequest.header("Content-Type" , "application/json");
    }




    public Board getIDResponse(String endPoint) {
        response = httpRequest.post(endPoint);

        Assert.assertEquals(response.statusCode(), 200);
        System.out.println(response.prettyPrint());
        Board board = response.getBody().as(Board.class);
        System.out.println(board.getURL());
       return board;
    }







    public static void main(String[] args) {
        AddBoard createBoard = new AddBoard("https://api.trello.com/1");
        createBoard.AddQueriesPara("Java Board","63970d162154920138c436f5");
        createBoard.AddHeaders();
        createBoard.getIDResponse("/boards");

    }
}
