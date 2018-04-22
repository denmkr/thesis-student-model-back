package ru.dm;

/**
 * Created by denis on 21/04/2018.
 */
public class Course {
    private String name;
    private String description;
    private String author;
    private String creationDate;
    private Node competenceNode;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public Node getCompetenceNode() {
        return competenceNode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setCompetenceNode(Node competenceNode) {
        this.competenceNode = competenceNode;
    }
}