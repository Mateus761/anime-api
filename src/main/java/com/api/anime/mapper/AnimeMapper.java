package com.api.anime.mapper;

import com.api.anime.entity.AnimeEntity;
import com.api.anime.request.AnimeRequest;
import com.api.anime.response.AnimeResponse;

public class AnimeMapper {

    public static AnimeResponse toResponse(AnimeEntity entitiy) {
        return AnimeResponse.builder()
                .nome(entitiy.getNome())
                .nota(entitiy.getNota())
                .src(entitiy.getSrc())
                .build();
    }

    public static AnimeEntity toEntity(AnimeRequest request) {
        return AnimeEntity.builder()
                .nome(request.getNome())
                .nota(request.getNota())
                .src(request.getSrc())
                .build();
    }
}
