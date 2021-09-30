package Interfaces;

import java.StartUps;
import java.util.List;

public interface StartUpsDao {
    //create
    void add(StartUps startUps);

    //read
    List<StartUps> getAll();
    StartUps findById(int id);

    //update
    void update(String newStartUp, int id);

    //delete
    void deleteAll();
    void deleteById(int id);

}
