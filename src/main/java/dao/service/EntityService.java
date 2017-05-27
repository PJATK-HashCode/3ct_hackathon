package dao.service;

import dao.repository.IRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import dao.HibernateUtil;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lelental on 27.05.2017.
 */
public class EntityService<Entity> implements IRepository<Entity> {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private Session session = sessionFactory.openSession();

    @Override
    public List<Entity> getAll(String entityName) {
        List<Entity> list = new ArrayList<>();

        try {
            session.getTransaction();
            session.getTransaction().begin();
            list = session.createQuery("from " + entityName + " ").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
        } finally {
            session.close();
        }
        return list;
    }


    @Override
    public void update(Entity entity) {
        try {
            session.getTransaction();
            session.getTransaction().begin();
            session.update(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
        } finally {
            session.close();
        }
    }

    @Override
    public void add(Entity entity) {
        try {
            session.getTransaction();
            session.getTransaction().begin();
            session.persist(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Entity entity) {
        try {
            session.getTransaction();
            session.getTransaction().begin();
            session.delete(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
        } finally {
            session.close();
        }
    }

    @Override
    public List<Entity> searchByCriteria(String criteria) {
        List<Entity> list = new ArrayList<>();
        try {
            session.getTransaction();
            session.getTransaction().begin();
            list = session.createQuery(criteria).list();
            session.getTransaction().commit();
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
        } finally {
            session.close();
        }
        return list;
    }
}