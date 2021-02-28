package cz.upce.inpia.dispring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    EmailService emailService;

    public void publishArticle(){
        System.out.println("Publish article");
        emailService.sendEmail();
    }
}
