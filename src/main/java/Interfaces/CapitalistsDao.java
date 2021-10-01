package Interfaces;

import model.Capitalists;

import java.util.List;

public interface CapitalistsDao {
    void create(Capitalists capitalist);
    List<Capitalists> findAll();
    Capitalists findById(int id);
    //    void update(int id,String);
    void deleteAll();
    void deleteById(int id);
}
