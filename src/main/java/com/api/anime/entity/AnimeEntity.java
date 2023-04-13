package com.api.anime.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnimeEntity {

    @Id
    private String id;

    private String nome;

    private String src;

    private double nota;

}
