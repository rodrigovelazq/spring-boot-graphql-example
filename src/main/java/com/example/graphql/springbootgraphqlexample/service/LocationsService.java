package com.example.graphql.springbootgraphqlexample.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.graphql.springbootgraphqlexample.dao.entity.Locations;
import com.example.graphql.springbootgraphqlexample.dao.repository.LocationsRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LocationsService {

	private final LocationsRepository locationsRepository;

	public LocationsService(final LocationsRepository locationsRepository) {
		this.locationsRepository = locationsRepository;
	}

	@Transactional
	public Locations createLocation(final String city, final String country, final String code, final String latitude,
			final String longitude) {
		final Locations location = new Locations();
		int newId = locationsRepository.getMaxId() + 1;

		location.setId(newId);
		location.setCity(city);
		location.setCountry(country);
		location.setCode(code);
		location.setLatitude(latitude);
		location.setLongitude(longitude);
		return this.locationsRepository.save(location);
	}

	@Transactional(readOnly = true)
	public List<Locations> getAllLocations(final int count) {
		return this.locationsRepository.findAll().stream().limit(count).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public Optional<Locations> getLocation(final int id) {
		return this.locationsRepository.findById(id);
	}
}
