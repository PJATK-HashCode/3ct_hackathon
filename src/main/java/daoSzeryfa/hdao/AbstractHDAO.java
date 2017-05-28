package daoSzeryfa.hdao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Kuba on 2017-01-30.
 */
public abstract class AbstractHDAO {
    private Session session;
    private Transaction transaction;

    public AbstractHDAO(){
        HibernateFactory.buildIfNeeded();
    }

    protected void saveOrUpdate(Object obj) {
        try{
            startOperation();
            session.saveOrUpdate(obj);
            transaction.commit();
        }catch (HibernateException e){
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
    }
    protected void delete(Object obj) {
        try {
            startOperation();
            session.delete(obj);
            transaction.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
    }
    protected Object getById(Class klass, int id) {
        Object obj = null;
        try {
            startOperation();
            obj = session.load(klass, id);
            transaction.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return obj;
    }

    protected void deleteAll() throws  DataAccessLayerException{
        List<Object> entityList = getAll(getClass());
        for (Object entity: entityList){
            delete(entity);
        }
    }


    protected List getAll(Class klass) {
        List objects = null;
        try {
            startOperation();
            Query query = session.createQuery("from " + klass.getName());
            objects = query.list();
            transaction.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return objects;
    }

    protected void handleException(HibernateException e) throws DataAccessLayerException {
        HibernateFactory.rollback(transaction);
        throw new DataAccessLayerException(e);
    }

    protected void startOperation() throws HibernateException {
        session = HibernateFactory.openSession();
        transaction = session.beginTransaction();
    }
}
