package sk.simo.ThymeleafDemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import sk.simo.ThymeleafDemo.model.Student;

import java.util.List;

@Controller
public class StudentController {

    @Value("${supportedCountries}")
    //property value injection, just use name from application.properties
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${systems}")
    private List<String> systems;

    @GetMapping("/showStudentForm")
    public String showForm(Model studentModel) {
        Student student = new Student();
        studentModel.addAttribute("student", student);
        studentModel.addAttribute("countries", countries);
        studentModel.addAttribute("languages", languages);
        studentModel.addAttribute("systems", systems);
        return "student-form";
    }


    @PostMapping("/processStudentForm")
    //@ModelAttribute holds bean binded to form
    public String processForm(@ModelAttribute("student") Student student) {
        System.out.println("Student is: " + student.toString());
        return "student-confirmation";
    }

}
