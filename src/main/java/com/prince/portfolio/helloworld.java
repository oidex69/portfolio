package com.prince.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloworld {
//    @GetMapping("/")
//    public String helloworld() {
//        return "helloworld";
//    }

    @GetMapping("/")
    public String aboutMe() {
        return "layout";
    }


}
