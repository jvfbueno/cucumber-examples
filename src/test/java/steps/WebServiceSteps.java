//package steps;
//
//import com.google.gson.Gson;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import customType.Post;
//
//import java.io.*;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//
//
//public class WebServiceSteps {
//    @Given("^the user wants to create a post$")
//    public void theUserWantsToCreateAPost() throws Throwable {
//        Post post = new Post("Tcha","balala", 1);
//        Gson gson = new Gson();
//        String json = gson.toJson(post);
//        createPost(json);
//        System.out.println(json);
//    }
//
//    @When("^he submits the post$")
//    public void heSubmitsThePost() throws Throwable {
//
//
//    }
//
//    @Then("^the post should be created$")
//    public void thePostShouldBeCreated() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//
//    }
//
//
//
//    private void createPost(String json){
//        try {
//            URL url = new URL("https://jsonplaceholder.typicode.com/posts");
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setConnectTimeout(5000);
//            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
//            conn.setDoOutput(true);
//            conn.setDoInput(true);
//            conn.setRequestMethod("POST");
//            OutputStream os = conn.getOutputStream();
//            os.write(json.getBytes("UTF-8"));
//            os.close();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
////            while(reader.){
////                System.out.println(reader.readLine());
////            }
//
//            conn.disconnect();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}
