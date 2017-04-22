package com.company;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import spark.ModelAndView;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;
import java.util.ArrayList;




public class Main {

    public static ArrayList<Cheeseburger> cheeseburgers = new ArrayList<>();

    public static void main(String[] args) {
        //create cheesburs
        //list cheesburgers
        //get Json from client return string of objects in Json
        cheeseburgers.add(new Cheeseburger(true, 3, 4, 5, "Special instructions"));

        Spark.get("/cheeseburgers", (req, res) -> {//JSON API to list all cheeseburgers
            JsonSerializer serializer = new JsonSerializer();
            return serializer.serialize(cheeseburgers);
        });

        Spark.post("/cheeseburgers", (req, res) -> {//JSON API to list all cheeseburgers
            //get data from request
            //convert data from json to cheeseburger
            //add cheeseburger object to cheeseburgers
            //return empty string

            // get the json to build a new food
            String json = req.body();
            // use the json to build food
            Cheeseburger food = new JsonParser().parse(json, Cheeseburger.class);
            //put the food in the list
            cheeseburgers.add(food);

            return "";

        });
    }
}