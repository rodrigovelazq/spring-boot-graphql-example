package com.example.graphql.springbootgraphqlexample.dao.repository;

import com.example.graphql.springbootgraphqlexample.dao.entity.Locations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationsRepository extends JpaRepository<Locations, Integer> {
	@Query(value = "SELECT MAX(l.id) FROM Locations l")
	Integer getMaxId();    
	
	
}
