package lk.ijse.dep.spring.jpa.pos.dao;

import lk.ijse.dep.spring.jpa.pos.entity.SuperEntity;

import java.util.List;

public interface CrudDAO<T extends SuperEntity,ID> extends SuperDAO {

    public abstract List<T> findAll();

    public abstract T find(ID id);

    public abstract void save(T entity);

    public abstract void update(T entity);

    public abstract void delete(ID id);

}
