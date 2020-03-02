package com.example.graphql.springbootgraphqlexample.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.springbootgraphqlexample.dao.entity.Locations;
import com.example.graphql.springbootgraphqlexample.service.LocationsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocationsMutation implements GraphQLMutationResolver {

	@Autowired
	private LocationsService locationsService;

	public Locations createLocations(
			final String city, 
			final String country, 
			final String code, 
			final String latitude,
			final String longitude) {
		return this.locationsService.createLocation(city, country, code, latitude, longitude);
	}
}
