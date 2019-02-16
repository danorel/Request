import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://github.com/danorel");
        HttpURLConnection HUC = (HttpURLConnection) url.openConnection();
        HUC.setRequestMethod("GET");
        for(Map.Entry entry : HUC.getHeaderFields().entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        System.out.println();
        for(Map.Entry entry : HUC.getRequestProperties().entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
