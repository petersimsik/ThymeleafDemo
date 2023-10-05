package sk.simo.ThymeleafDemo.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import sk.simo.ThymeleafDemo.model.Customer;

@Controller
public class CustomerController {
    @GetMapping("/showCustomerForm")
    public String showForm(Model customerModel) {
        Customer customer = new Customer();
        customerModel.addAttribute("customer", customer);

        return "customer-form";
    }

    @PostMapping("/processCustomerForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult validationResult) {
        if (validationResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }
    }
}
