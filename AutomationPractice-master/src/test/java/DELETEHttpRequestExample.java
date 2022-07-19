import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DELETEHttpRequestExample extends java.lang.Object {

    public static void main(String[] args) throws IOException, InterruptedException, IllegalArgumentException {

        String delete = "https://dummy.restapiexample.com/api/v1/delete/2";

        var request = HttpRequest.newBuilder()
                .uri(URI.create(delete))
                .header("Content-Type", "application/json")
                .DELETE()
                .build();

        var client = HttpClient.newHttpClient();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());

   }
}
