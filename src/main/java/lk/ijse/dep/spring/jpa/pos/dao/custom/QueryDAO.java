package lk.ijse.dep.spring.jpa.pos.dao.custom;

import lk.ijse.dep.spring.jpa.pos.dao.SuperDAO;
import lk.ijse.dep.spring.jpa.pos.entity.CustomEntity;

import java.util.List;

public interface QueryDAO extends SuperDAO {

    CustomEntity getOrderInfo(int orderId);

    CustomEntity getOrderInfo2(int orderId);

    /**
     *
     * @param query customerId, customerName, orderId, orderDate
     * @return
     * @throws Exception
     */
    List<CustomEntity> getOrdersInfo(String query);

}
