package com.example.graphql.springbootgraphqlexample.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.springbootgraphqlexample.dao.entity.Locations;
import com.example.graphql.springbootgraphqlexample.service.LocationsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class LocationsQuery implements GraphQLQueryResolver {

	@Autowired
	private LocationsService locationsService;

	public List<Locations> getLocations(final int count) {
		return this.locationsService.getAllLocations(count);
	}

	public Optional<Locations> getLocation(final int id) {
		return this.locationsService.getLocation(id);
	}
}
