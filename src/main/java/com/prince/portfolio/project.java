package com.prince.portfolio;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class project {

    private String name;
    private String path;
    private String image;
    private String subtitle;
    private String description;
    private String status;
    private String githubUrl;
    private List<Tech> techStack;
    private Map<String,String> imageUrl;
    private Map<String, String> feature;
    private List<String> learned;

    public project(String name,
                   String path,
                   String image,
                   String subtitle,
                   String description,
                   String status,
                   String githubUrl,
                   List<Tech> techStack,
                   Map<String,String> imageUrl,
                   Map<String, String> feature,
                   List<String> learned) {

        this.name = name;
        this.path = path;
        this.image = image;
        this.subtitle = subtitle;
        this.description = description;
        this.status = status;
        this.githubUrl = githubUrl;
        this.techStack = techStack;
        this.imageUrl = imageUrl;
        this.feature = feature;
        this.learned = learned;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getImage() {
        return image;
    }

    public String getSubtitle() { return subtitle; }

    public String getDescription() {
        return description;
    }

    public String getStatus() { return status; }

    public List<Tech> getTechStack() {
        return techStack;
    }

    public String getGithubUrl() { return githubUrl; }

    public Map<String, String> getImageUrl() { return imageUrl; }

    public Map<String,String> getFeature() {return feature; }

    public List<String> getLearned() { return learned;}
}
