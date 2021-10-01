package model;
import java.util.Objects;
public class Capitalists {
    private int Id;
    private String name;
    private String contacts;
    private String category;
    private int amount;


    public Capitalists(String name, String contacts, String category,int amount) {
        this.amount=amount;
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

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Capitalists that = (Capitalists) o;
        return Id == that.Id &&
                contacts == that.contacts &&
                Objects.equals(name, that.name) &&
                Objects.equals(category, that.category)&&
                Objects.equals(amount,that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, contacts, category,amount);
    }
}


