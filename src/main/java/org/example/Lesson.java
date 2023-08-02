package org.example;

import java.sql.Timestamp;

public class Lesson {
    private int id;
    private String name;
    private Timestamp updatedAt;
    private Homework homework;

    public Lesson(String name, Homework homework) {
        this.name = name;
        this.homework = homework;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Homework getHomework() {
        return homework;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", create=" + updatedAt +
                ", homework=" + homework +
                '}';
    }
}
