package org.sid.lightecomv1.dao;

import java.util.List;

import org.sid.lightecomv1.entities.Product;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {

	@RestResource(path="/selectedProducts")
	public List<Product> findBySelectedIsTrue();
	@RestResource(path="/productsByKeyword")
	public List<Product> findByNameContains(@Param("mc") String mc);
	
}
