package sk.simo.ThymeleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.simo.ThymeleafDemo.domain.Status;

import java.util.Date;

@Controller
public class DemoController {
    @GetMapping("/hello")
    public String sayHello(Model theModel) {
        theModel.addAttribute("theDate", new Date());
        //since we have thymeleaf in pom, spring boot will autoconfigure it
        //it will search for template in /src/main/resources/templates/helloWorld.html
        return "helloWorld";
    }
}
