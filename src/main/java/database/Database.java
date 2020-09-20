package database;

import models.Car;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class Database {

    private static Logger logger = LoggerFactory.getLogger("Database.class");

    private Database(){}

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Cars");

    private static EntityManager getEntityManager() {

        return emf.createEntityManager();
    }

    public static void commitChanges(Car entity){
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

    public static void uploadEntityToDatabase(Car entity){
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

    public static void removeEntity(Car entity){
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

    public static void closeEmf(){

        emf.close();
    }

}
