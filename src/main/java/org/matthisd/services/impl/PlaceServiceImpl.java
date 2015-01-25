package org.matthisd.services.impl;

import org.matthisd.domain.Place;  
import org.matthisd.repositories.PlaceRepository;  
import org.matthisd.services.PlaceService;  
import org.apache.commons.collections4.IteratorUtils;  
import org.springframework.stereotype.Service;

import javax.annotation.Resource;  
import java.util.Collection;

@Service(value = "placeService")
public class PlaceServiceImpl implements PlaceService {

    @Resource
    private PlaceRepository placeRepository;

    @Override
    public Collection<Place> getAllPlaces() {
        return IteratorUtils.toList(this.placeRepository.findAll().iterator());
    }

    @Override
    public Place getPlaceById(Long id) {
        return this.placeRepository.findOne(id);
    }

    @Override
    public Place createPlace(Place place) {
        return this.placeRepository.save(place);
    }

    @Override
    public Place updatePlace(Place place) {
        return this.placeRepository.save(place);
    }

    @Override
    public void deletePlace(Long id) {
        this.placeRepository.delete(id);
    }

    @Override
    public Place getPlaceByShortName(String shortName) {
        return this.placeRepository.findByShortName(shortName);
    }

    public PlaceRepository getPlaceRepository() {
        return placeRepository;
    }

    public void setPlaceRepository(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }
}