package com.example.FreshHire.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
public class Description {
    private String qualification;
    private String about;
    private  String requirements;

    public Description(){
    }

    public Description(String qualification, String about, String requirements) {
        this.qualification = qualification;
        this.about = about;
        this.requirements = requirements;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }
}
