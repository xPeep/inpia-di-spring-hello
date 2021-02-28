package cz.upce.inpia.dispring.demo;

import cz.upce.inpia.dispring.demo.service.ArticleService;
import cz.upce.inpia.dispring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoApplication {

    @Autowired
    UserService userService;

    @Autowired
    ArticleService articleService;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "cz.upce.inpia.dispring.demo"
        );

        context.getBean(DemoApplication.class).process();
    }

    private void process() {
        userService.createAccount();
        articleService.publishArticle();
    }

}
