package com.mohit.dogRestAPI.service;

import com.mohit.dogRestAPI.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveDog();
    List<String> retrieveDogNames();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
}
