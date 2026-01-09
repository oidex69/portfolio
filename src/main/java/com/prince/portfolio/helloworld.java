package com.prince.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class helloworld {

    @GetMapping("/")
    public String aboutMe(Model m) {
        m.addAttribute("activePage","home");

        List<project> prj = new ArrayList<>();
        prj.add(new project("onCheck","onCheck"));
        prj.add(new project("realState","realState"));

        m.addAttribute("projects",prj);
        return "layout";
    }

    @GetMapping("/onCheck")
    public String onCheck(Model m) {
        m.addAttribute("activePage","onCheck");
        return "layout";
    }

    @GetMapping("/realState")
    public String realState(Model m) {
        m.addAttribute("activePage","realState");
        return "layout";
    }
}
