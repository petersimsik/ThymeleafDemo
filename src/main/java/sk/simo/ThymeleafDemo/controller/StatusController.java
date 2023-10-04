package sk.simo.ThymeleafDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.simo.ThymeleafDemo.domain.Status;

@RestController
public class StatusController {
    @GetMapping("/status")
    public Status printStatus() {
        Status status = new Status("OK");
        return status;
    }
}
