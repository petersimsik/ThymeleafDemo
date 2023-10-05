package sk.simo.ThymeleafDemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

    //@RequestMapping(path = "/showForm", method = RequestMethod.GET)
    //or
    @GetMapping("/showForm")
    public String showForm() {
        return "helloWorld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloStudent";
    }

    @RequestMapping(path ="/processFormV2", method=RequestMethod.GET)
    public String processFormV2(HttpServletRequest request, Model theModel) {
        String studentName = request.getParameter("studentName");
        String message = "YO " + studentName.toUpperCase() + "!";
        theModel.addAttribute("message", message);
        return "helloStudentV2";
    }

    @PostMapping("/processFormV3")
    //request binding
    public String processFormV3(@RequestParam("studentName") String studentName, Model theModel) {
        String message = "HEY " + studentName.toUpperCase() + "!";
        theModel.addAttribute("message", message);
        return "helloStudentV2";
    }
}
