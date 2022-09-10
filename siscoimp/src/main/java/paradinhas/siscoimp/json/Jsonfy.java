/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.json;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import javax.print.DocFlavor;
import org.json.JSONObject;

/**
 *
 * @author rodri
 */
public class Jsonfy {

    static public void saveJsonFile(JSONObject json) {
        try ( FileWriter file = new FileWriter("teste")) {
            json.write(file);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static public JSONObject readJsonFile() {
        JSONObject json = new JSONObject();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("teste"));
            json = new JSONObject(reader.readLine());
            reader.close();
            System.out.println(json.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        return json;
    }
}
