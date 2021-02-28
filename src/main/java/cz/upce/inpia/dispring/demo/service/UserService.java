package cz.upce.inpia.dispring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserService {

    @Autowired
    EmailService emailService;

    public void createAccount(){
        System.out.println("Account created");
        emailService.sendEmail();
    }

    @PostConstruct
    public void loadUserCache(){
        System.out.println("User cache loaded");
    }
}
