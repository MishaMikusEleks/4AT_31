package task.day_5;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import task.day_4.reflection.MyAnyCustomClass;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class JsonSerial {

    public static void main(String[] args) {




        // json init
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("field1","value1");
        System.out.println(jsonObject);

        // json to object
        ObjectMapper objectMapper = new ObjectMapper();
        MyAnyCustomClass object=
                null;
        try {
            object = objectMapper.readValue(jsonObject.toString(), MyAnyCustomClass.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(object);

        // object to json
        object.setField3(666);
        JSONObject jsonObject2=new JSONObject(object);
        System.out.println(jsonObject2);

        // text to json
        //object = objectMapper.readValue(jsonObject.toString(), MyAnyCustomClass.class);

        // json to file
        ;
        File file = new File("tmp.json");

        try {
            FileWriter fileWriter=new FileWriter(file);
            fileWriter.write(jsonObject2.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // file to json
        try {
            String content = Files.readString(Path.of(file.getAbsolutePath()));
            System.out.println(new JSONObject(content));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // json navigation (array, get, keySet)

        jsonObject2.put("arrayField",new JSONArray());
        jsonObject2.getJSONArray("arrayField")
                .put(new JSONObject("{\"field666\":\"666\"}"));

        System.out.println(jsonObject2);

        // json to map
        Map<String,Object> jsonMap=jsonObject2.toMap();
        System.out.println(jsonMap);

        // map to json
        jsonMap.put("mapField","mapField");
        System.out.println(new JSONObject(jsonMap));
    }
}
