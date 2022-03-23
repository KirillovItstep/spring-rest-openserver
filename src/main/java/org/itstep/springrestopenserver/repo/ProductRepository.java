package org.itstep.springrestopenserver.repo;

import org.itstep.springrestopenserver.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
