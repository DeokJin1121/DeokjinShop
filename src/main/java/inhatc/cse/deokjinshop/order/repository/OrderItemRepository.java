package inhatc.cse.deokjinshop.order.repository;

import inhatc.cse.deokjinshop.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
