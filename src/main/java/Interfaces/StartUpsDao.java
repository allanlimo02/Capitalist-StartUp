package Interfaces;


import model.StartUps;

import java.util.List;

public interface StartUpsDao {
    void add(StartUps startUps);

    List<StartUps> startUps();

    void delete(StartUps startUps);

    void deleteById(int id);
}
