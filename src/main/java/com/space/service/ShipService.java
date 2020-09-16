package com.space.service;

import com.space.model.Ship;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface ShipService {

    List<Ship> getAllShips(Specification<Ship> specification);

    Page<Ship> getAllShips(Specification<Ship> specification, Pageable sortedByName);

    Ship createShip(Ship requestShip);

    Ship getShip(Long id);

    Ship editShip(Long id, Ship ship);

    void deleteById(Long id);

    boolean existsById(long id) ;
}
