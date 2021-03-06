package tutorials.mahedi.websocket.chat_app.common.message;

//import java.io.StringReader;
//import javax.json.Json;
//import javax.json.JsonObject;
import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonException;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

public class JsonMessageDecoder implements Decoder.Text<JsonWrapper> {

	public void init(EndpointConfig config) {
		// TODO Auto-generated method stub

	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public JsonWrapper decode(String s) throws DecodeException {
		JsonObject json = Json.createReader(new StringReader(s)).readObject();
		System.out.println("JsonWrapper decode: ");
		return new JsonWrapper(json);
	}

	public boolean willDecode(String s) {
		// TODO Auto-generated method stub
		try {
			Json.createReader(new StringReader(s)).read();
			return true;
		} catch (JsonException ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
