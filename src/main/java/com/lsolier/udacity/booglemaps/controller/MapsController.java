package com.lsolier.udacity.booglemaps.controller;

import com.lsolier.udacity.booglemaps.model.Address;
import com.lsolier.udacity.booglemaps.service.MapService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maps")
public class MapsController {

  private MapService service;

  public MapsController(MapService service) {
    this.service = service;
  }

  @GetMapping
  public Address getAddress(@RequestParam Double lon, @RequestParam Double lat) {
    return service.findAddress(lon, lat);
  }
}
