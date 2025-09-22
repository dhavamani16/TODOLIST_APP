package com.todo.model;

import java.time.LocalDateTime;

public class Todo{
     private int id;
    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public todo(){
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

    public Todo( String title, String description) {
        this(); 
        this.title = title;
        this.description = description;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public LocalDateTime getCreated_at() {
        return created_at;
    }
    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
    public LocalDateTime getUpdated_at() {
        return updated_at;
    }


}