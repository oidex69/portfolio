package com.prince.portfolio;

public class experience {
    private String title; // What is the work that is done(eg: java Delveloper)
    private String workYear;
    private String logo;

    public experience(
            String title,
            String workYear,
            String logo
    ) {
        this.title = title;
        this.workYear = workYear;
        this.logo = logo;
    }

    public String getTitle() { return title; }

    public String getWorkYear() { return workYear; }

    public String getLogo() { return logo; }

}
