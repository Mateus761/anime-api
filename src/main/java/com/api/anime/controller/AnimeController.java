package com.api.anime.controller;


import com.api.anime.entity.AnimeEntity;
import com.api.anime.request.AnimeRequest;
import com.api.anime.response.AnimeResponse;
import com.api.anime.service.AnimeService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/api/v1/animes")
public class AnimeController {

    @Autowired
    private AnimeService service;


    @PostMapping()
    public AnimeResponse post(@RequestBody AnimeRequest anime){
        return service.save(anime);
    }

    @GetMapping("/get")
    public List<AnimeResponse> getAll(AnimeResponse anime) {
        return service.getAll();
    }

}
