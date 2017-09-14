package com.chatbox.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Parameters {
	private String skills;

    private String job_category;

    private String region;

    private String state;

    private String experience;

    private String country;

    public String getSkills ()
    {
        return skills;
    }

    public void setSkills (String skills)
    {
        this.skills = skills;
    }

    public String getJob_category ()
    {
        return job_category;
    }

    public void setJob_category (String job_category)
    {
        this.job_category = job_category;
    }

    public String getRegion ()
    {
        return region;
    }

    public void setRegion (String region)
    {
        this.region = region;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getExperience ()
    {
        return experience;
    }

    public void setExperience (String experience)
    {
        this.experience = experience;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [skills = "+skills+", job_category = "+job_category+", Region = "+region+", state = "+state+", experience = "+experience+", country = "+country+"]";
    }
}
