import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {

        get("/new/startup",(request,response)->{
            Map<String,Object> model=new HashMap<>();
            return new ModelAndView(model,"newStartup.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
