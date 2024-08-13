package iuri.medina.springboot.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iuri.medina.springboot.models.ProductModel;


@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID>{
}
