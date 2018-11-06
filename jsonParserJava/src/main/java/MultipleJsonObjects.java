import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class MultipleJsonObjects {
	  public static void main(String[] args) {
	    	//Create JSON parser Object
	    	JSONParser parser = new JSONParser();
	    	int facebookCount=0;
	    	try {
	        	//Store the parsed JSON Text in an Object
	            Object obj = parser.parse(new FileReader("MultipleJsonData.txt")); 
	            //Type cast Object just read into JSON Object
	            JSONArray jsonArray = (JSONArray) obj;
	            //access the values for particular keys
	            for (int i=0;i<jsonArray.size();i++){
	            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
	            String name = (String) jsonObject.get("Name");
	            String author = (String) jsonObject.get("Author");
	            JSONArray companyList = (JSONArray) jsonObject.get("Company List");
	            System.out.println("Name: " + name);
	            System.out.println("Author: " + author);
	            System.out.println("Company List:");
	            //Parse Through the JSON Array!
	            for(int j=0;j<companyList.size();j++){
	            	System.out.println(companyList.get(j));
	            	if(((String)companyList.get(j)).contains("Facebook")){
	            		facebookCount++;
	            	}
	            }
	            //Convert JSON directly to String!
	            System.out.println(JSONObject.toJSONString((JSONObject)jsonArray.get(i)));
	           
	            System.out.println();
	            }
	            System.out.println("The Number of people working in Facebook from the JSON are: "+facebookCount);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
