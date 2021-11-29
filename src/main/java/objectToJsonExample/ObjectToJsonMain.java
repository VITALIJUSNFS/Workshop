package objectToJsonExample;

import com.fasterxml.jackson.databind.ObjectMapper;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class ObjectToJsonMain {

    public static void main(String[] args) throws IOException {

//        ObjectMapper mapper =new ObjectMapper();
        FileWriter file = null;

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id","1");
        jsonObject.put("firstName","Dainius");
        jsonObject.put("lastName","Pilypas");

        System.out.println( jsonObject.toJSONString());

        Dog dog = new Dog("Rexas", "Cihuahua :)");
        file = new FileWriter("src/main/resources/dog.json");

        JSONObject dogJson = new JSONObject();
        //JSON objektas yra kai
        dogJson.put("sunsVardas", dog.getName());
        dogJson.put("sunsVeisle", dog.getBreed());
        file.write(dogJson.toString());
        file.close();


    }
}
