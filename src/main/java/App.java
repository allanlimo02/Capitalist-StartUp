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

        staticFileLocation("/public");
        Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5433","","");
        Connection con = sql2o.open();
        Sql2oCapitalists captalistsDao = new Sql2oCapitalists(sql2o);
        Sql2oStartUps startUpsDao = new Sql2oStartUps(sql2o);

        get("/",((request, response) -> {
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }), new HandlebarsTemplateEngine());

        get("/mentee-signupform",((request, response) -> {
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model, "mentee-signupform.hbs");
        }), new HandlebarsTemplateEngine());

        get("/mentor-signupform",((request, response) -> {
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model, "mentor-signupform.hbs");
        }), new HandlebarsTemplateEngine());

        post("/mentor-signupform/mentors",((request, response) -> {
            Map<String,Object> model = new HashMap<>();
            String name = request.queryParams("name");
            int Amount = Integer.parseInt(request.queryParams("amount"));
            String category = request.queryParams("category");
            Capitalists capitalist = new Capitalists(name,Amount,category);
            captalistsDao.add(capitalist);
            model.put("capitalist", capitalist);
            return new ModelAndView(model, "mentorlist.hbs");
        }), new HandlebarsTemplateEngine());

        post("/mentee-signupform/mentees",((request, response) -> {
            Map<String,Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String name_of_startup = request.queryParams("start-upName");
            String category = request.queryParams("category");
            int capital_needed = Integer.parseInt(request.queryParams("amount"));
            StartUps startUp = new StartUps(name,name_of_startup,category,capital_needed);
            startUpsDao.add(startUp);
            model.put("startUp",startUp);
            return new ModelAndView(model, "menteelist.hbs");
        }), new HandlebarsTemplateEngine());
    }
}
