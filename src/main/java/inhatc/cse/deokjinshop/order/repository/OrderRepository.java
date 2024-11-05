package inhatc.cse.deokjinshop.order.repository;

import inhatc.cse.deokjinshop.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order, Long> {
}
