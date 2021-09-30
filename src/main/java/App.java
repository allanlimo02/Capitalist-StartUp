import model.Capitalists;
import org.sql2o.Sql2o;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import sql2oDao.Sql2oCapitalists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

import static spark.Spark.staticFileLocation;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        Sql2o sql2o= new Sql2o("jdbc:postgresql://localhost:5432/startup_mentorship","kip","1234");

        Sql2oCapitalists sql2oCapitalists = new Sql2oCapitalists();

        get("/sign_in",(request, response) -> {
            Map<String,Object> model= new HashMap<>();
            return new ModelAndView(model,"form_investors.hbs");
        },new HandlebarsTemplateEngine());
        post("/investor-view",(request, response) -> {
            Map<String, ArrayList<Capitalists>>model = new HashMap<>();
            String name = request.queryParams("name");
            String contacts = request.queryParams("contacts");
            String category = request.queryParams("category");
            Capitalists capitalists1= new Capitalists(name,contacts,category);
            sql2oCapitalists.create(capitalists1);
            return new ModelAndView(model, "form_investors.hbs");
        },new HandlebarsTemplateEngine());
    }
}
