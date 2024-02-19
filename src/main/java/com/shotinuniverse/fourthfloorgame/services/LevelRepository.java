package com.shotinuniverse.fourthfloorgame.services;

import com.shotinuniverse.fourthfloorgame.entities.Level;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface LevelRepository extends MongoRepository<Level, String> {

    @Query("{number:?0}")
    Level findItemByNumber(int number);

    public long count();
}
