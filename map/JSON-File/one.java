package web.tests.admin;

import java.io.*;

import java.util.*;

import org.json.simple.*;

import org.json.simple.parser.*;

public class jsonreader {           

   public static void main(String[] args) {

  // Read data from file

JSONParser parser = new JSONParser(); // json parser used for read-only access to json data

try {

Object obj = parser.parse(new FileReader("C:/Users/Documents/readjsonfile.json"));  //Read json file path where json file in system

         JSONObject jsonObject = (JSONObject)obj;

         String name = (String)jsonObject.get("Name");

         String course = (String)jsonObject.get("Course");

         JSONArray subjects = (JSONArray)jsonObject.get("Subjects");

         System.out.println("Name: " + name);

         System.out.println("Name: " + jsonObject.get("Name"));

         System.out.println("Course: " + course);

         System.out.println("Subjects:");

         Iterator iterator = subjects.iterator(); // iterator used for cycle through arguments which are present in file or collection

         while (iterator.hasNext())

{

            System.out.println(iterator.next());

         }

      } catch(Exception e) {

         e.printStackTrace();

      }

   }

}