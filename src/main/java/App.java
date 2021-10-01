import com.google.gson.Gson;
import model.StartUps;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import sql2oDao.Sql2oCapitalists;
import sql2oDao.Sql2oStartUps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {

        // API PREP
        Connection conn;
        Sql2oStartUps sql2oStartUps;
        Sql2oCapitalists sql2oCapitalists;
        Gson gson = new Gson();

        String connectionString = "jdbc:h2:~/localhost.db;INIT=RUNSCRIPT from 'classpath:Db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "ngetich", "12345");
        sql2oStartUps = new Sql2oStartUps(sql2o);
//        sql2oCapitalists =new Sql2oCapitalists(sql2o);
//        conn = sql2o.open();
        staticFileLocation("resources");

        //Getter to display startup form
        get("/new/startup",(request,response)->{
            Map<String,Object> model=new HashMap<>();
            return new ModelAndView(model,"newStartup.hbs");
        }, new HandlebarsTemplateEngine());

        //get inputs from the form
        post("/success", (request,response)-> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String name_of_startup=request.queryParams("name_of_startup");
            String category=request.queryParams("category");
            int capital_needed = Integer.parseInt(request.queryParams("capital_needed"));
            StartUps startUps1=new StartUps(name,name_of_startup,category,capital_needed);
            sql2oStartUps.add(startUps1);
            return new ModelAndView(model,"success.hbs");
        }, new HandlebarsTemplateEngine());

        //Display all Start-Ups via hbs
        get("/allstartups", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<StartUps> startUps =sql2oStartUps.findAll();
            model.put("startUps",startUps);
            return new ModelAndView(startUps, "allstartups.hbs");
        }, new HandlebarsTemplateEngine());

        // post method to create a new start-up in postman
        post("/new/start-ups", "application/json", (req, res) -> {
            StartUps startUps = gson.fromJson(req.body(), StartUps.class);
            sql2oStartUps.add(startUps);
            res.status(201);
            res.type("application/json");
            return gson.toJson(startUps);
        });
        //fetch from postman
        get("/startups", "application/json", (req, res) -> {
            res.type("application/json");
            return gson.toJson(sql2oStartUps.findAll());
        });
    }
}
