package sk.simo.ThymeleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sk.simo.ThymeleafDemo.model.Customer;

@Controller
public class CustomerController {
    @GetMapping("/showCustomerForm")
    public String showCustomerForm(Model customerModel) {
        Customer customer = new Customer();
        customerModel.addAttribute("customer", customer);

        return "customer-form";
    }
}
