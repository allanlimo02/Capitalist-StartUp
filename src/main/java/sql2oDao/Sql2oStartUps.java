package sql2oDao;

import Interfaces.StartUpsDao;
import org.sql2o.Sql2o;

import java.StartUps;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;


public class Sql2oStartUps implements StartUpsDao {
    Sql2o sql2o= new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker","kyl","1234");

    @Override
    public void add(StartUps startUps) {
        String sql ="INSERT INTO startups (id, name, name_of_startup, category, capital_needed) VALUES (:id, :name, :name_of_startup, :category, :capital_needed)";
        try(Connection con = sql2o.open()){
            int id = (int) con.createQuery(sql, true)
                    .bind(startUps)
                    .executeUpdate()
                    .getKey();
            startUps.setId(id);
        }catch (Sql2oException ex){
            System.out.println(ex);
        }
    }

    @Override
    public List<StartUps> getAll() {
        try (Connection con =sql2o.open()){
            return con.createQuery("SELECT * FROM startups")
                    .executeAndFetch(StartUps.class);
        }
    }

    @Override
    public StartUps findById(int id) {
        try (Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM startups WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(StartUps.class);
        }
    }

    @Override
    public void update(String newStartUp, int id) {

    }

    @Override
    public void deleteAll() {
        String sql = "DELETE FROM startups";
        try(Connection con = sql2o.open()){
            con.createQuery(sql)
                    .executeUpdate();
        }catch (Sql2oException ex){
            System.out.println(ex);
        }

    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM startups WHERE id = :id";
        try(Connection con = sql2o.open()){
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch(Sql2oException ex){
            System.out.println(ex);
        }
    }
}
