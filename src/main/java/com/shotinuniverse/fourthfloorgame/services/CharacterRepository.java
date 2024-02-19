package com.shotinuniverse.fourthfloorgame.services;

import com.shotinuniverse.fourthfloorgame.entities.Character;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CharacterRepository extends MongoRepository<Character, String> {

    @Query("{_id:?0}")
    Character findItemById(int _id);

    public long count();
}
