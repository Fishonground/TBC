package client;


import server.God;
import server.exceptions.EmptyArgException;
import server.exceptions.MySQLException;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
            URL url = new URL ("http://0.0.0.0:8080/");
            try {
            	System.out.println("=== Get all gods ===");
            	printer(getAllGods());
            	
//				System.out.println("=== Get gods by name ===");
//				printer(getGodsByName("Зевс"));
//				
//				System.out.println("=== Get gods by culture ===");
//				printer(getGodsByCulture("ВТ"));
//				
//				System.out.println("=== Get gods by god_of ===");
//				printer(getGodsByGodOf("Войны"));
//				
//				System.out.println("=== Get all gods by id ==="); 
//				printer(getGodById(1));
//				
//				System.out.println("=== Get all gods By Name And Culture ===");
//				printer(getGodsByNameAndCulture("Зевс","Греция"));  
//				System.out.println("=== Get gods By Culture And GodOf ===");
//				printer(getGodsByCultureAndGodOf("Греция","Грома"));  
				
				System.out.println("=== Create new god ===");
				God cr_god = getGodById(1).get(0);
				cr_god.setName("Лунтик");
				cr_god.setCulture("Земля");
				cr_god.setPower("Я");
            	cr_god.setGod_of("Родился");
            	try {
            		printer(createGod(cr_god));
            	} catch (Exception e) {
            		System.out.println("Creating went wrong!");
            	}
            	
            	
            	System.out.println("=== Check the result ===");
            	printer(getAllGods());
            	
            	System.out.println("=== Update the god ===");
            	God upd_god = getGodById(19).get(0);
            	upd_god.setName("");
            	if (updateGod(upd_god))
            		System.out.println("Success!");
            	else
            		System.out.println("Something went wrong!");
            	
            	System.out.println("=== Check the result ===");
            		printer(getAllGods());
            	
            	System.out.println("=== Delete the god ===");
            	if (deleteGod(16))
            		System.out.println("Success!");
            	else
            		System.out.println("Something went wrong!");
            	System.out.println("=== Check the result ===");
            		printer(getAllGods());
            }
            catch (Exception e) {
            	System.out.println(e.getStackTrace().toString());
            	System.out.println(e.getMessage());
          }
        }


        public static void printer ( List<God> gods){
        for (God god : gods) {
            System.out.println("Ancient GOD " + god.getName() + " from " + god.getCulture() + " culture, " +
                    god.getPower() + ". God of " + god.getGod_of());
        }
     }
        
        
        
        public static boolean deleteGod(int id) throws Exception {
    		String methodName = "/" + id;
    		RequestSender sender = new RequestSender(methodName, new HashMap<>());

    		RestResponse response = sender.doDelete();

    		if (!String.valueOf(response.code).startsWith("2")) {
    			System.out.println(response.body.get("exception").toString());
    			System.out.println(response.body.get("message").toString());
    			return false;
    		} else {
    			System.out.println(response.body.get("answer").toString());
    			return true;
    		}
    	}
        
        
        
        public static List<God> createGod(God god) throws Exception {

    		String methodName = "";

    		HashMap<String, Object> bodyParts = new HashMap<String, Object>();

    		bodyParts.put("id", god.getid());
    		bodyParts.put("name", god.getName());
    		bodyParts.put("culture", god.getCulture());
    		bodyParts.put("power", god.getPower());
    		bodyParts.put("god_of", god.getGod_of());
    		
    		RequestSender sender = new RequestSender(methodName, bodyParts);

    		RestResponse response = sender.doPost();

    		if (!String.valueOf(response.code).startsWith("2")) {
    			System.out.println(response.body.get("exception").toString());
    			System.out.println(response.body.get("message").toString());
    			return null;
    		} else {
    			return parsingResponse(response);
    		}
        }
        
        
        public static boolean updateGod(God god) throws Exception {
        	
        	
    		String methodName = "/upd/" + god.getid();

    		HashMap<String, Object> bodyParts = new HashMap<String, Object>();

    		bodyParts.put("id", god.getid());
    		bodyParts.put("name", god.getName());
    		bodyParts.put("culture", god.getCulture());
    		bodyParts.put("power", god.getPower());
    		bodyParts.put("god_of", god.getGod_of());

    		RequestSender sender = new RequestSender(methodName, bodyParts);

    		RestResponse response = sender.doPut();

    		if (!String.valueOf(response.code).startsWith("2")) {
    			System.out.println(response.body.get("exception").toString());
    			System.out.println(response.body.get("message").toString());
    			return  false;
    		} else {
    			System.out.println(response.body.get("answer").toString());
    			return true;
    		}
    	}
        
        
        public static List<God> getGodById(int id) throws Exception {
    		God god = null;

    		String methodName = new String("/id/"+id);

    		RequestSender sender = new RequestSender(methodName, new HashMap<>());
    		
    		RestResponse response = sender.doGet();

    		if (!String.valueOf(response.code).startsWith("2")) {
    			System.out.println(response.body.get("exception").toString());
    			System.out.println(response.body.get("message").toString());
    			return null;
    		} else {
    			return parsingResponse(response);
    		}

    		
    	}
    	
    	public static List<God> getAllGods() throws Exception {
    		RequestSender sender = new RequestSender("", new HashMap<>());
    		RestResponse response = sender.doGet();

    		return parsingResponse(response);
    		
    	}
    	
    	public static List<God> getGodsByName(String name) throws Exception {

    		God god = null;

    		String methodName = new String("/name/"+name);

    		RequestSender sender = new RequestSender(methodName, new HashMap<>());
    		RestResponse response = sender.doGet();

    		if (!String.valueOf(response.code).startsWith("2")) {
    			System.out.println(response.body.get("exception").toString());
    			System.out.println(response.body.get("message").toString());
    			return null;
    		} else {
    			return parsingResponse(response);
    		}

    	}
    	
    	public static List<God> getGodsByCulture(String culture) throws Exception {
    		God god = null;

    		String methodName = new String("/culture/"+culture);

    		RequestSender sender = new RequestSender(methodName, new HashMap<>());
    		RestResponse response = sender.doGet();

    		if (!String.valueOf(response.code).startsWith("2")) {
    			System.out.println(response.body.get("exception").toString());
    			System.out.println(response.body.get("message").toString());
    			return null;
    		} else {
    			return parsingResponse(response);
    		}

    	}
    	
    	public static List<God> getGodsByPower(String power) throws Exception {

    		God god = null;

    		String methodName = new String("/power/"+power);

    		RequestSender sender = new RequestSender(methodName, new HashMap<>());
    		RestResponse response = sender.doGet();

    		if (!String.valueOf(response.code).startsWith("2")) {
    			System.out.println(response.body.get("exception").toString());
    			System.out.println(response.body.get("message").toString());
    			return null;
    		} else {
    			return parsingResponse(response);
    		}

    	}
    	
    	public static List<God> getGodsByGodOf(String god_of) throws Exception {
    		God god = null;

    		String methodName = new String("/god_of/"+god_of);

    		RequestSender sender = new RequestSender(methodName, new HashMap<>());
    		RestResponse response = sender.doGet();

    		if (!String.valueOf(response.code).startsWith("2")) {
    			System.out.println(response.body.get("exception").toString());
    			System.out.println(response.body.get("message").toString());
    			return null;
    		} else {
    			return parsingResponse(response);
    		}

    	}
    	
    	public static List<God> getGodsByCultureAndGodOf( String culture, String god_of) throws Exception {

    		God god = null;

    		String methodName = new String("/culture_god_of/"+ culture + "/" + god_of);

    		RequestSender sender = new RequestSender(methodName, new HashMap<>());
    		RestResponse response = sender.doGet();

    		if (!String.valueOf(response.code).startsWith("2")) {
    			System.out.println(response.body.get("exception").toString());
    			System.out.println(response.body.get("message").toString());
    			return null;
    		} else {
    			return parsingResponse(response);
    		}

    	}
    	
    	public static List<God> getGodsByNameAndCulture(String name, String culture) throws Exception {
    		God god = null;
    		String methodName = new String("/name_culture/"+ name + "/" + culture);
    		RequestSender sender = new RequestSender(methodName, new HashMap<>());
    		RestResponse response = sender.doGet();

    		if (!String.valueOf(response.code).startsWith("2")) {
    			System.out.println(response.body.get("exception").toString());
    			System.out.println(response.body.get("message").toString());
    			return null;
    		} else {
    			return parsingResponse(response);
    		}

    	}
    	
    	
    	
    	public static List<God> parsingResponse( RestResponse response) {
    		Gson gs = new Gson();
    		ArrayList<God> gods = new ArrayList<>();
    		String str = response.body.get("god").toString();
    		String[] words = str.split("}");
            for (String word : words) {     	
            	word = word.substring(1, word.length()).trim();
            	if (word.length() >= 2) {
            		word = word + "\"}";
            		boolean loop = true;
        			int prev_ind = 4;
            		while(loop) {
            			int indexM = word.indexOf("=",prev_ind);
            			if (indexM == -1) {
            				loop = false;
            			}
            			else {
            				word = word.substring(0,indexM+1) + "\"" + word.substring(indexM+1, word.length());
            				prev_ind = indexM+1;
            			}
            		}
            		loop = true;
        			prev_ind = 8;
            		while(loop) {
            			int indexM = word.indexOf(",",prev_ind);
            			if (indexM == -1) {
            				loop = false;
            			}
            			else {
            				word = word.substring(0,indexM) + "\"" + word.substring(indexM, word.length());
            				prev_ind = indexM+2;
            			}
            		}
            		//System.out.println(word);
            		God g = gs.fromJson(word, God.class);
            		gods.add(g);
            		//System.out.println(g.getid());
            	}
            	
            }
            return gods;
    	}
    	

}
