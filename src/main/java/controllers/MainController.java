package controllers;

import db.DBHelper;
import db.Seeds;
import models.Article;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.SparkBase.port;
import static spark.SparkBase.staticFileLocation;

public class MainController {

    public static void main(String[] args) {

        port(getHerokuAssignedPort());

        Seeds.seedData();

        staticFileLocation("/public");

        LoginController loginController = new LoginController();
        JournalistController journalistController = new JournalistController();
        ArticleController articleController = new ArticleController();
        AdminController adminController = new AdminController();

        get("/news", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Article> articles = DBHelper.orderByDateCreatedNewestFirst();
            model.put("articles", articles);
            model.put("template", "templates/front-page.vtl");
            return new ModelAndView(model, "templates/newslayout.vtl");
        }, new VelocityTemplateEngine());


        get("/admin", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String loggedInUser = LoginController.getLoggedInUserName(req, res);
            model.put("user", loggedInUser);
            model.put("template", "templates/admin/index.vtl");

            return new ModelAndView(model, "templates/adminlayout.vtl");
        }, new VelocityTemplateEngine());

    }

    public static int getHerokuAssignedPort(){
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567;
    }
}
