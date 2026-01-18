package com.prince.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class helloworld {
    private final String projectLocation = "project";
    Map<String,project> prj = new HashMap<>();

    public helloworld() {
        prj.put("onCheck", new project("onCheck",
                "onCheck",
                "/images/onCheck/onCheckFrontUi.png",
                "A Java-based application built with Maven, following standard enterprise development practices.",
                "This project implements a predictive analytics web application for estimating residential property values, " +
                        "focusing on both house price prediction and land price prediction." +
                        " At its core, the system integrates machine learning-driven valuation models with a backend API layer, enabling structured inputs" +
                        " (such as area, location attributes, built-up specification, and land metrics) to produce reliable price estimates." +
                        " The solution combines data-driven modeling with a scalable server architecture, delivering an end-to-end forecasting capability that" +
                        " supports real estate decision-making.",
                "At its current stage, onCheck represents an early-phase implementation," +
                        " suitable for learning and experimentation. With added documentation," +
                        " clear feature definitions, and versioning, it can evolve into a" +
                        " production-ready or showcase-level application.",
                "https://github.com/oidex69/onCheck",
                List.of(
                        new Tech("Java", "/images/java-logo.png"),
                        new Tech("Spring Boot", "/images/spring-boot-logo.png"),
                        new Tech("HTML", "/images/html-logo.png")
                ),
                Map.of(
                        "Main Interface", "/images/onCheck/onCheckFrontUi.png",
                        "Login Interface", "/images/onCheck/onCheckLoginUi.png" )
        ));
        prj.put("realState", new project(
                "Real State",
                projectLocation,
                "/images/realState/realStateHomePage.png",
                "A machine learning–driven real estate price prediction system built using Spring Boot.",
                "This project implements a predictive analytics web application for estimating residential property values,\n" +
                        " focusing on both house price prediction and land price prediction.\n" +
                        " At its core, the system integrates machine learning-driven valuation models with a backend API layer, enabling structured inputs\n" +
                        " (such as area, location attributes, built-up specification, and land metrics) to produce reliable price estimates.\n" +
                        " The solution combines data-driven modeling with a scalable server architecture, delivering an end-to-end forecasting capability that\n" +
                        " supports real estate decision-making.",
                "The application is structured as a Spring Boot (Java) backend, adopting a clear Model-View-Controller (MVC) architecture.\n" +
                        " The Model encapsulates price prediction logic and data representation, the View layer delivers responsive interfaces for user interaction,\n" +
                        " and the Controller orchestrates data flow and business rules between the client and models.\n" +
                        " The prediction components leverage regression techniques — integrating training, validation, and runtime inference stages — to estimate property\n" +
                        " values based on relevant features. User interactions (e.g., specifying house attributes or land parameters) trigger real-time predictions served\n" +
                        " through REST endpoints and rendered in the frontend interface.",
                "https://github.com/oidex69/housePricePrediction",
                List.of(
                        new Tech("Java", "/images/java-logo.png"),
                        new Tech("Spring Boot", "/images/spring-boot-logo.png"),
                        new Tech("Html","/images/html-logo.png"),
                        new Tech("Css","/images/css-logo.png"),
                        new Tech("Mysql","/images/mysql-logo.png"),
                        new Tech("JavaScript","/javascript-logo.png")
                ),
                Map.of(
                        "Home Page","images/realState/realStateHomePage.png",
                        "House Price Prediction","images/realState/homePricePrediction.png",
                        "Land Price Prediction","images/realState/landpriceprediction.png"
                )


        ));
    }

    @GetMapping("/")
    public String aboutMe(Model m) {
        m.addAttribute("activePage","home");

//        prj.add(new project("realState","realState","realState",));
//        prj.add(new project("realState",
//                "realState",
//                "/images/realState/realStateHomePage.png",
//                "A java-based Spring Boot Application.",
//                "https://github.com/oidex69/housePricePrediction",
//                List.of(
//                        new Tech("Java","/images/java-logo.png"),
//                        new Tech("Spring Boot", "/images/spring-boot-logo.png"),
//                        new Tech("HTML", "/images/html-logo.png"),
//                        new Tech("Css", "/images/css-logo.png"),
//                        new Tech("Mysql", "/images/mysql-logo.png"),
//                        new Tech("JavaScript", "/images/javascript-logo.png")
//                )
//                ));

        m.addAttribute("projects",prj);
        m.addAttribute("projects",prj);
        return "layout";
    }

    @GetMapping("/onCheck")
    public String onCheck(Model m) {
        m.addAttribute("activePage","onCheck");
        m.addAttribute("onCheckStyle",true);
        m.addAttribute("projects",prj);
        return "layout";
    }

    @GetMapping("/realState")
    public String realState(Model m) {
        m.addAttribute("activePage","realState");
        m.addAttribute("realStateStyle",true);
        return "layout";
    }
}
