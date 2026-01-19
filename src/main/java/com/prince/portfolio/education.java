package com.prince.portfolio;

public class education {
    private String title;
    private String institution;
    private String year;
    private String logo;

    public education(
            String title,
            String institution,
            String year,
            String logo
    ) {
        this.title = title;
        this.institution = institution;
        this.year = year;
        this.logo = logo;
    }

    public String getTitle() { return title; }

    public String getInstitution() { return institution; }

    public String getYear() { return year; }

    public String getLogo() { return logo; }
}
