import java.util.ArrayList;
import org.json.simple.JSONObject;

class CreateJsonData {

   @SuppressWarnings("unchecked")
public static void main(String[] args){
      JSONObject obj = new JSONObject();
      
      //put Key, Value pairs in the JSONObject and 
     obj.put("Name", "Darshan");
      obj.put("Id", new Integer(100));
      obj.put("Salary", new Double(1000.21));
      obj.put("Access", new Boolean(true));
      ArrayList<String> company=new ArrayList<>();
      company.add("Google");
      company.add("Facebook");
      company.add("Version 1");
      obj.put("Company", company);
      System.out.print(obj);
   }
}