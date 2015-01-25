package org.matthisd.repositories;

import org.matthisd.domain.Place;  
import org.springframework.data.repository.CrudRepository;

public interface PlaceRepository extends CrudRepository<Place, Long> {  
    Place findByShortName(String shortName);
}