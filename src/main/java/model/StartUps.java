package model;

import java.util.Objects;

public class StartUps {
    private int id;
    private String name;
    private String name_of_startup;
    private String category;
    private int capital_needed;

    public StartUps(String name, String name_of_startup, String category, int capital_needed) {
        this.name = name;
        this.name_of_startup = name_of_startup;
        this.category = category;
        this.capital_needed = capital_needed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_of_startup() {
        return name_of_startup;
    }

    public void setName_of_startup(String name_of_startup) {
        this.name_of_startup = name_of_startup;
    }

    public String getCategory() { return category; }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCapital_needed() {
        return capital_needed;
    }

    public void setCapital_needed(int capital_needed) {
        this.capital_needed = capital_needed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StartUps startUps = (StartUps) o;
        return id == startUps.id &&
                capital_needed == startUps.capital_needed &&
                Objects.equals(name, startUps.name) &&
                Objects.equals(name_of_startup, startUps.name_of_startup) &&
                Objects.equals(category, startUps.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, name_of_startup, category, capital_needed);
    }
}
