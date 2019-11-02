package com.lsolier.udacity.booglemaps.service;

import com.lsolier.udacity.booglemaps.model.Address;
import com.lsolier.udacity.booglemaps.model.repositiry.MockAddressRepository;
import org.springframework.stereotype.Service;

@Service
public class MapService {

  private MockAddressRepository repository;

  public MapService(MockAddressRepository repository) {
    this.repository = repository;
  }

  public Address findAddress(Double lon, Double lat) {
    return repository.getRandomAddress(lon, lat);
  }

}
