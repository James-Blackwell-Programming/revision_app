package com.example.revision_app;

import java.io.Serializable;

public class note implements Serializable {
    private int id;
    private String title;
    private String input_text;
    private gradings grade;

    public note(int id, String title, String input_text, gradings grade) {
        this.id = id;
        this.title = title;
        this.input_text = input_text;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "note{" +
                "title='" + title + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInput_text() {
        return input_text;
    }

    public void setInput_text(String input_text) {
        this.input_text = input_text;
    }

    public gradings getGrade() {
        return grade;
    }

    public void setGrade(gradings grade) {
        this.grade = grade;
    }
}
