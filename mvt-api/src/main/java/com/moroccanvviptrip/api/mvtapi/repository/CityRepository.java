package com.moroccanvviptrip.api.mvtapi.repository;

import com.moroccanvviptrip.api.mvtapi.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CityRepository extends JpaRepository<City, Long> {
    Optional<City> findByNameIgnoreCase(String name);

    boolean existsByName(String name);

    List<City> findByRegion(String region);
}
