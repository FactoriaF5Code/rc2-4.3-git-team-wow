package net.toyland.store.controllers.customers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.GetMapping;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @GetMapping 
    public String hello() {
        return "Hello!"
    }
}
