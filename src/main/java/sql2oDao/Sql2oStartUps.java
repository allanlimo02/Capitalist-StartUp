package sql2oDao;

import Interfaces.StartUpsDao;
import model.StartUps;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;

public class Sql2oStartUps implements StartUpsDao {
    private final Sql2o sql20;
    public Sql2oStartUps(Sql2o sql20) {
        this.sql20 = sql20;
    }

    @Override
    public void add(StartUps startUps) {
        String sql="INSERT INTO startup ( name,name_of_startup,category,capital_needed) VALUES (:name,:name_of_startup,:category,:capital_needed)";
        try (Connection conn= sql20.open()){
            int id=(int)conn.createQuery(sql,true)
                    .bind(startUps)
                    .executeUpdate()
                    .getKey();
            startUps.setId(id);
            }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @Override
    public List<StartUps> findAll() {
        Connection conn=sql20.open();
        return conn.createQuery("SELECT * FROM startup")
                .executeAndFetch(StartUps.class);
    }
    @Override
    public void deleteAll(StartUps startUps) {
        Connection conn= sql20.open();
        conn.createQuery("DELETE * FROM startup")
                .executeUpdate();
    }
    @Override
    public void deleteById(int id) {
        Connection conn= sql20.open();
        conn.createQuery("DELETE * FROM startup WHERE id=:id")
                .executeUpdate();
    }
}
