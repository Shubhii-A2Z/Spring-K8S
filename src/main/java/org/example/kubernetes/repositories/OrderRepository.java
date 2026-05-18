package org.example.kubernetes.repositories;

import org.example.kubernetes.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

    @Query("Select a from Order a")
    List<Order> getAll();
}
