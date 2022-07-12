package org.example.model;

public class DummyUser {

    private String id;
    private String fullName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DummyUser(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }
}
