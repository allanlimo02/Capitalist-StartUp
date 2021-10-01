package sql2oDao;

import Interfaces.CapitalistsDao;
import model.Capitalists;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oCapitalists implements CapitalistsDao {
    Sql2o sql2o= new Sql2o("jdbc:postgresql://localhost:5432/startup_mentorship","kip","1234");

    @Override
    public void create(Capitalists capitalist) {
        String sql = "INSERT INTO investor (name,contacts,category,amount) VALUES(:name,:contacts,:category,:amount)";
        try(Connection con= sql2o.open()){
            int id = (int) con.createQuery(sql,true)
                    .bind(capitalist)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();
            capitalist.setId(id);
        }catch (Sql2oException e){
            System.out.println(e);
        }
    }

    @Override
    public List<Capitalists> findAll() {
        try( Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM investor ")
                    .executeAndFetch(Capitalists.class);
        }

    }

    @Override
    public Capitalists findById(int id) {
            try(Connection con = sql2o.open()){
                return con.createQuery("SELECT * FROM investor  WHERE id=:id")
                        .addParameter("id",id)
                        .throwOnMappingFailure(false)
                        .executeAndFetchFirst(Capitalists.class);
            }
    }

    @Override
    public void deleteAll() {
        String sql = "DELETE FROM investor";
        try(Connection con = sql2o.open()){
            con.createQuery(sql)
                    .executeUpdate();
        }catch(Sql2oException e){
            System.out.println(e);
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM investor WHERE id=:id";
        try(Connection con = sql2o.open()){
            con.createQuery(sql).addParameter("id",id)
                    .executeUpdate();
        }catch(Sql2oException e){
            System.out.println("run");
        }
    }
}
