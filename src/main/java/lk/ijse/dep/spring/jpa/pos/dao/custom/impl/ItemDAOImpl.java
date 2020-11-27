package lk.ijse.dep.spring.jpa.pos.dao.custom.impl;

import lk.ijse.dep.spring.jpa.pos.dao.CrudDAOImpl;
import lk.ijse.dep.spring.jpa.pos.dao.custom.ItemDAO;
import lk.ijse.dep.spring.jpa.pos.entity.Item;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
public class ItemDAOImpl extends CrudDAOImpl<Item, String> implements ItemDAO {

    @Override
    public String getLastItemCode(){
        Query nativeQuery = entityManager.createNativeQuery("SELECT code FROM Item ORDER BY code DESC LIMIT 1");
        return nativeQuery.getResultList().size() > 0 ? (String) nativeQuery.getSingleResult() : null;
    }

}
