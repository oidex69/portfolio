package com.prince.portfolio;

import java.util.List;

public class project {

    private String name;
    private String path;
    private String slug;
    private String image;
    private String description;
    private String githubUrl;
    private List<Tech> techStack;

    public project(String name,
                   String slug,
                   String path,
                   String image,
                   String description,
                   String githubUrl,
                   List<Tech> techStack) {

        this.name = name;
        this.slug = slug;
        this.path = path;
        this.image = image;
        this.description = description;
        this.githubUrl = githubUrl;
        this.techStack = techStack;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public String getPath() {
        return path;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public List<Tech> getTechStack() {
        return techStack;
    }

    public String getGithubUrl() { return githubUrl; }
}
