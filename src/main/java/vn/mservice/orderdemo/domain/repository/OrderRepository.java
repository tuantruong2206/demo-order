package vn.mservice.orderdemo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.mservice.orderdemo.domain.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
