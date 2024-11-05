package inhatc.cse.deokjinshop.cart.repository;

import inhatc.cse.deokjinshop.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
