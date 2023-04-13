package com.api.anime.service;


import com.api.anime.entity.AnimeEntity;
import com.api.anime.mapper.AnimeMapper;
import com.api.anime.repository.AnimeRepository;
import com.api.anime.request.AnimeRequest;
import com.api.anime.response.AnimeResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AnimeService {

    private final AnimeRepository repository;

    public List<AnimeResponse> getAll() {
        return repository.findAll().stream().map(AnimeMapper::toResponse).collect(Collectors.toList());
    }

    public AnimeResponse save(AnimeRequest request){

        AnimeEntity anime = repository.save(AnimeMapper.toEntity(request));

        return AnimeMapper.toResponse(anime);
    }
}
