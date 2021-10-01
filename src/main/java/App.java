import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;


public class App {
    public static void main(String[] args) {

        staticFileLocation("/public");

        get("/",((request, response) -> {
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }), new HandlebarsTemplateEngine());

        get("/mentee-signup",((request, response) -> {
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model, "loginform.hbs");
        }), new HandlebarsTemplateEngine());

        get("/mentor-signup",((request, response) -> {
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model, "signupform.hbs");
        }), new HandlebarsTemplateEngine());

        get("//mentor-signup/mentors",((request, response) -> {
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model, "mentorlist.hbs");
        }), new HandlebarsTemplateEngine());

        get("/mentee-signup/mentees",((request, response) -> {
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model, "menteelist.hbs");
        }), new HandlebarsTemplateEngine());
    }
}
