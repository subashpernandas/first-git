package com.example.first_git;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/family")
public class TestController  {

    @GetMapping("/get")
    public String getCall() {
        return "SUBASH-PERNANDAS-SAVARI-JESU-VIYAGULA-INNACI-ARULAYAMMAL-MARIANTHONI-KANNAN-MONISH-ARYAN";
    }
}
