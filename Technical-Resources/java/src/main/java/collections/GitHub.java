package collections;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class GitHub {

    private final static String GITHUB_URL = "https://api.github.com/repos/robot297/hello-world";

    
    /**
     * A better way to call an API, this also sets up headers and uses
     * the HttpClient which is very robust.
     * @return Description of the repo this method connects too.
     */
    public String getGitHubInfo(){

        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {

            HttpGet request = new HttpGet(GITHUB_URL);

            request.addHeader("Accept", "application/vnd.github.v3+json");
            request.addHeader("Authorization", "token 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");

            CloseableHttpResponse response = httpClient.execute(request);

            HttpEntity entity = response.getEntity();


            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(EntityUtils.toString(entity));

            return String.valueOf(jsonObject.get("description"));

        } catch (Exception e) {
            return e.getMessage();
        }
        
    }
}
