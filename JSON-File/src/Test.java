
//package web.tests.admin;

import java.io.*;

import java.util.*;

import org.json.simple.*;

import org.json.simple.parser.*;

class Test{

         public static void main(String[] args) {

             // Read data from file

             JSONParser parser = new JSONParser(); // json parser used for read-only access to json data

             try {

                 Object obj = parser.parse(new FileReader("C:/Users/Documents/readjsonfile.json"));  //Read json file path where json file in system

                 JSONObject jsonObject = (JSONObject) obj;

                 long id = (Long) jsonObject.get("id");

                 String name = (String) jsonObject.get("name");

                 String email = (String) jsonObject.get("email");

                 JSONArray subjects = (JSONArray) jsonObject.get("Subjects");

                 System.out.println("id: " + id);

                 System.out.println("id: " + jsonObject.get("id"));

                 System.out.println("email: " + email);

                 System.out.println("Subjects:");

             }

         }

     }
}
