package writeJson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJson {
   public  static void main(String[] args)  throws IOException {
	 
   
	
	
	JSONObject object = new JSONObject();
	String name= (String) object.put("name", "ajith");
	Long sal=(Long) object.put("salary", "35000");
	JSONArray array = new JSONArray();
	array= (JSONArray) object.put("spe","think positive");
	FileWriter file = new FileWriter("ak.json"); 
	file.write(object.toString());
	file.close();
	
}
}