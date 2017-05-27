package dao.repository;

import java.util.List;

/**
 * @author Lelental on 27.05.2017.
 */
public interface IRepository<Entity> {

    List<Entity> getAll(String entityName);

    void update(Entity entity);

    void add(Entity entity);

    void delete(Entity entity);
}
