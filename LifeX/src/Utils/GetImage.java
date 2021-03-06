package Utils;

import java.sql.Blob;
import java.util.Base64;

import org.json.JSONObject;

public class GetImage {

	public static String getImage(JSONObject pic) throws Exception{
		Blob blob = (Blob) pic.get("profile_pic");
		int len = (int) blob.length();
		byte[] buf = blob.getBytes(1, len);	
		byte[] encodeBase64 = Base64.getEncoder().encode(buf);
		return new String(encodeBase64, "UTF-8");
	}
}
