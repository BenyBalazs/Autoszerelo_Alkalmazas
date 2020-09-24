package database;

import models.Car;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public final class Database {

    private static Logger logger = LoggerFactory.getLogger("Database.class");

    private Database(){}

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Cars");

    private static EntityManager getEntityManager() {

        return emf.createEntityManager();
    }

    public static void commitCarChanges(Car entity){
        EntityManager em = getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            em.close();
        }catch (Exception e){
            logger.error("A hiba forrása {}", e.toString());
        } finally {
            em.close();
        }
    }

    public static void uploadCarToDatabase(Car entity){
        EntityManager em = getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            em.close();
            logger.debug("Entitás sikeresen elmentve az adatbázisban!");
        }catch (Exception e){
            logger.error("A hiba forrása {}", e.toString());
        } finally {
            em.close();
        }
    }

    public static void removeCarFromDatabase(Car entity){
        EntityManager em = getEntityManager();
        try{
            logger.debug("Removing Entity {}",entity.toString());
            em.getTransaction().begin();
            em.remove(em.contains(entity) ? entity : em.merge(entity));
            em.getTransaction().commit();
            logger.debug("Removed Entity");
        }catch (Exception e){
            logger.error("A hiba forrása {}", e.toString());
        } finally {
            em.close();
        }
    }

    public static List<Car> getAllCarsByState(Car.State state){

        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Car> cq = cb.createQuery(Car.class);
        Root<Car> from = cq.from(Car.class);

        cq.select(from).where(cb.equal(from.get("state"), state));

        try{
            Query q = em.createQuery(cq);
            return q.getResultList();
        }catch(Exception e){
            logger.error("A javításra váró kocsik lekérdezés sikertelen. Hiba oka {}",e.toString());
        }finally {
            em.close();
        }
        return new ArrayList<Car>();
    }

    public static void closeEmf(){

        emf.close();
    }

}
