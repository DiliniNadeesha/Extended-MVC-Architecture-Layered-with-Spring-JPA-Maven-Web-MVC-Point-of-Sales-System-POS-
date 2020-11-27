package lk.ijse.dep.spring.jpa.pos.dao.custom.impl;

import lk.ijse.dep.spring.jpa.pos.dao.CrudDAOImpl;
import lk.ijse.dep.spring.jpa.pos.dao.custom.CustomerDAO;
import lk.ijse.dep.spring.jpa.pos.entity.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
public class CustomerDAOImpl extends CrudDAOImpl<Customer, String> implements CustomerDAO {

    @Override
    public String getLastCustomerId(){
        Query nativeQuery = entityManager.
                createNativeQuery("SELECT id FROM Customer ORDER BY id DESC LIMIT 1");
        return nativeQuery.getResultList().size() > 0? (String) nativeQuery.getSingleResult() : null;
    }
}
