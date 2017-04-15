package net.furikuri;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    @GeneratedValue
    private Long id;
    private String task;
    private String note;

    public Todo() {
    }

    public Todo(String task, String note) {
        this.task = task;
        this.note = note;
    }

    public Todo(Long id, String task, String note) {
        this.id = id;
        this.task = task;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
