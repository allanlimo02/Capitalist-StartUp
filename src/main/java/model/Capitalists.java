package model;

import java.util.Objects;

public class Capitalists {
    private int Id;
    private String name;
    private int contacts;
    private String category;


    public Capitalists(String name, int contacts, String category) {
        this.name = name;
        this.contacts = contacts;
        this.category = category;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContacts() {
        return contacts;
    }

    public void setContacts(int contacts) {
        this.contacts = contacts;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Capitalists that = (Capitalists) o;
        return Id == that.Id &&
                contacts == that.contacts &&
                Objects.equals(name, that.name) &&
                Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, contacts, category);
    }
}
