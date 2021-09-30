package Interfaces;


import model.StartUps;

import java.util.List;

public interface StartUpsDao {
    void add(StartUps startUps);

    List<StartUps> findAll();

    void deleteAll(StartUps startUps);

    void deleteById(int id);
}
