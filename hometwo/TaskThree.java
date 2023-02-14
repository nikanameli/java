
package hometwo;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import org.json.simple.parser.ParseException;
import org.primefaces.shaded.json.JSONArray;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TaskOne {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        System.out.println(new File(".").getAbsolutePath());
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("./file.json"));
        for (Object jo: jsonArray) {
            JSONObject person = (JSONObject) jo;
            StringBuilder stringBuilder = new StringBuilder("Студент ");
            stringBuilder.append(person.get("фамилия"));
            stringBuilder.append(" получил ");
            stringBuilder.append(person.get("оценка"));
            stringBuilder.append(" по предмету ");
            stringBuilder.append(person.get("предмет"));
            System.out.println(stringBuilder.toString());
        }
    }
}
