import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//Parse Json Data from a text file
 
public class JsonParserSimple {
 
    public static void main(String[] args) {
    	//Create JSON parser Object
    	JSONParser parser = new JSONParser();
        try {
        	//Store the parsed JSON Text in an Object
            Object obj = parser.parse(new FileReader("JSONData.txt")); 
            //Type cast Object just read into JSON Object
            JSONObject jsonObject = (JSONObject) obj;
            //access the values for particular keys
            String name = (String) jsonObject.get("Name");
            String author = (String) jsonObject.get("Author");
            JSONArray companyList = (JSONArray) jsonObject.get("Company List");
 
            System.out.println("Name: " + name);
            System.out.println("Author: " + author);
            System.out.println("\nCompany List:");
            //Parse Through the JSON Array!
            for(int i=0;i<companyList.size();i++){
            	System.out.println(companyList.get(i));
            }
        
            //Convert JSON directly to String!
            System.out.println(JSONObject.toJSONString(jsonObject));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}