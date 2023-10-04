package sk.simo.ThymeleafDemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloWorld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloStudent";
    }

    @RequestMapping("/processFormV2")
    public String processFormV2(HttpServletRequest request, Model theModel) {
        String studentName = request.getParameter("studentName");
        String message = "YO " + studentName.toUpperCase() + "!";
        theModel.addAttribute("message", message);
        return "helloStudentV2";
    }
}
