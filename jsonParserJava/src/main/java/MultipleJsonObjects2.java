import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class MultipleJsonObjects2 {
	  public static void main(String[] args) {
	    	//Create JSON parser Object
	    	JSONParser parser = new JSONParser();
	    	int nissanCount=0;
	    	int nissanXuvCount=0;
	    	int nissanSedanCount=0;
	    	int nissanHatchbackCount=0;
	    	int audiCount=0;
	    	int audiXuvCount=0;
	    	int audiSedanCount=0;
	    	int audiHatchbackCount=0;
	    	int toyotaCount=0;
	    	int toyotaXuvCount=0;
	    	int toyotaSedanCount=0;
	    	int toyotaHatchbackCount=0;
	    	try {
	        	//Store the parsed JSON Text in an Object
	            Object obj = parser.parse(new FileReader("MultipleJsonData2.txt")); 
	            //Type cast Object just read into JSON Object
	            JSONArray jsonArray = (JSONArray) obj;
	            //access the values for particular keys
	            for (int i=0;i<jsonArray.size();i++){
	            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
	            String brand = (String) jsonObject.get("Brand");
	            String model = (String) jsonObject.get("Model");
	            long quantity = (Long)jsonObject.get("Quantity");
	            System.out.println("Brand: " + brand);
	            System.out.println("Model: " + model);
	            System.out.println("Quantity:"+quantity);
	            System.out.println("------------------------------------------------------------");
	            //Count total Number of Nissan
	            if(brand.toLowerCase().equals("nissan")){
	            	nissanCount++;
	            	if(model.toLowerCase().equals("xuv")){
	            		nissanXuvCount+=quantity;
	            	}
	            	if(model.toLowerCase().equals("sedan")){
	            		nissanSedanCount+=quantity;
	            	}
	            	if(model.toLowerCase().equals("hatchback")){
	            		nissanHatchbackCount+=quantity;
	            	}
	            }
	          //Count total Number of Nissan
	            if(brand.toLowerCase().equals("audi")){
	            	audiCount++;
	            	if(model.toLowerCase().equals("xuv")){
	            		audiXuvCount+=quantity;
	            	}
	            	if(model.toLowerCase().equals("sedan")){
	            		audiSedanCount+=quantity;
	            	}
	            	if(model.toLowerCase().equals("hatchback")){
	            		audiHatchbackCount+=quantity;
	            	}
	            }
	          //Count total Number of Nissan
	            if(brand.toLowerCase().equals("toyota")){
	            	toyotaCount++;
	            	if(model.toLowerCase().equals("xuv")){
	            		toyotaXuvCount+=quantity;
	            	}
	            	if(model.toLowerCase().equals("sedan")){
	            		toyotaSedanCount+=quantity;
	            	}
	            	if(model.toLowerCase().equals("hatchback")){
	            		toyotaHatchbackCount+=quantity;
	            	}
	            }
	            System.out.println();
	            }
	            //Print Nissan Summary
	            System.out.println("########### NISSAN ##########\nQuantities:\n There were "+nissanCount+" Nissan orders!\n1)Sedan: "+nissanSedanCount+"\n2)Hatchback: "+nissanHatchbackCount+"\n3)XUV: "+nissanXuvCount+"\n");
	            //Print Audi Summary
	            System.out.println("########### AUDI ##########\nQuantities:\n There were "+audiCount+" Audi orders!\n1)Sedan: "+audiSedanCount+"\n2)Hatchback: "+audiHatchbackCount+"\n3)XUV: "+audiXuvCount+"\n");
	            //Print Toyota Summary
	            System.out.println("########### TOYOTA ##########\nQuantities:\n There were "+toyotaCount+" Toyota orders!\n1)Sedan: "+toyotaSedanCount+"\n2)Hatchback: "+toyotaHatchbackCount+"\n3)XUV: "+toyotaXuvCount);
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
