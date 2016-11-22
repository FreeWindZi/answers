package com.navy.answers.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by navychen on 16/11/18.
 */
public abstract class BasePaperAnswer implements Serializable {
    protected int id;
    protected int year;
    protected String type;
    protected List<Section> sections;
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
