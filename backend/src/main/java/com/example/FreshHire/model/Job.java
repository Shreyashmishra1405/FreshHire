package com.example.FreshHire.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    @NotBlank(message = "name is missing")
    private String name;
    @NotBlank(message = "CompanyName is missing")
    private  String companyName;
    @Embedded
    private  Description description;
    private String location;
    @NotBlank(message = "Link is missing ")
    private String applicationLink;
    @DateTimeFormat(style = "yyyy-mm-dd")
    private LocalDate postedDate;
    public Description getDescription() {
        return description;
    }
    public void setDescription(Description description) {
        this.description = description;
    }
    public LocalDate getPostedDate() {
        return postedDate;
    }
    public void setPostedDate(LocalDate postedDate) {
        this.postedDate = postedDate;
    }
    public String getApplicationLink() {
        return applicationLink;
    }
    public void setApplicationLink(String applicationLink) {
        this.applicationLink = applicationLink;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public  Job(){
    }
    @Override
    public String toString() {
        return "Job{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
