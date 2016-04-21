package com.lab2.dto;

import java.util.List;

/**
 * Created by rasmus on 4/21/16.
 */
public class RecipeDto {

    private String title,body;
    private List<PartDto> parts;

    public List<PartDto> getParts() {
        return parts;
    }

    public void setParts(List<PartDto> parts) {
        this.parts = parts;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
