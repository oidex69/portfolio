package com.prince.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class helloworld {
    Map<String,project> prj = new HashMap<>();

    public helloworld() {
        prj.put("On Check", new project("On Check",
                "projectInside",
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
                //
                List.of(
                        new Tech("Java", "/images/java-logo.png"),
                        new Tech("Spring Boot", "/images/spring-boot-logo.png"),
                        new Tech("HTML", "/images/html-logo.png")
                ),
                // Map of picture to be shown
                Map.of(
                        "Main Interface", "/images/onCheck/onCheckFrontUi.png",
                        "Login Interface", "/images/onCheck/onCheckLoginUi.png" ),
//              Map Of features of the program
                Map.of(
                  "Tally","Better Tally method",
                  "Safe Storage", "Best for Storing tallies per Date"
                ),
                // List of What i've Learned
                List.of(
                        "Structuring a Java project using Maven best practices",
                        "Separating backend logic from presentation concerns",
                        "Building and styling a simple UI for a Java-based application"
                )
        ));

        prj.put("Real State", new project(
                "Real State",
                "onCheck",
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
                        new Tech("JavaScript","images/javascript-logo.png")
                ),
                Map.of(
                        "Home Page","images/realState/realStateHomePage.png",
                        "House Price Prediction","images/realState/homePricePrediction.png",
                        "Land Price Prediction","images/realState/landpriceprediction.png"
                ),
                Map.of(
                        "Home Price Prediction"," Machine learning models that estimate property values for residential units based on key features (size, number of rooms, location factors, age, etc.).",
                        "Land Price Prediction","Dedicated estimation functionality for land parcels,incorporating metrics such as plot area, zoning classification, and geographic descriptors.",
                        "Modular Code Structure"," Modular Code Structure: MVC framework separation for maintainability, testability, and extensibility."
                ),
                List.of(
                        "Integrating machine learning prediction logic into a Java backend",
                        "Processing and validating user input before model inference",
                        "Structuring a Java project using Maven best practices"
                )
        ));
    }

    @GetMapping("/")
    public String aboutMe(
            @RequestParam(required = false) String visitingPage,
            Model m
            ) {
        m.addAttribute("loadPage","home");
        m.addAttribute("projects",prj);
        m.addAttribute("projects",prj);
        return "layout";
    }

    @GetMapping("/{projectKey}")
    public String onCheck(
            @PathVariable String projectKey,
            @RequestParam(required = false) String visitingPage,
            Model m
            ) {

        project selectedProject = prj.get(visitingPage);

        if(selectedProject == null) {
            return "error/404";
        }

        m.addAttribute("project",selectedProject);
        m.addAttribute("projectInsideStyle",true);
        m.addAttribute("activePage",visitingPage);
        m.addAttribute("loadPage","projectInside");
        return "layout";
    }

    @GetMapping("/realState")
    public String realState(
            @RequestParam(required = false) String visitingPage,
            Model m) {
        m.addAttribute("visitingPage",visitingPage);
        m.addAttribute("activePage","realState");
        m.addAttribute("realStateStyle",true);
        return "layout";
    }


}
