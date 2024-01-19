package com.stempien.registrationForm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {
    @GetMapping("/formController")
    @ResponseBody
    public String hello(@RequestParam String firstName, @RequestParam String lastName,String password,String date,String location) {
        System.out.println("Imie: "+firstName+" Nazwisko: "+lastName+" Hasło: "+password+" Data urodzenia: "+date+" Miejscowość: "+location);
        return "Wysłano maila.";
    }
}
