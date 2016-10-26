package serviceREST;

import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;

public class JAXRSClient {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:8080/jax-rs-example/rest/service/hola");
		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		if (urlConnection.getResponseCode() != 200) {
			throw new RuntimeException("Error de conexión: " + urlConnection.getResponseCode());
		}
		String response = IOUtils.toString(urlConnection.getInputStream());
		System.out.println("Respuesta: " + response);
	}
}