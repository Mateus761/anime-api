package com.api.anime.repository;


import com.api.anime.entity.AnimeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRepository extends MongoRepository<AnimeEntity, Integer> {
}
