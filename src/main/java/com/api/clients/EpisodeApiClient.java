package com.api.clients;

import com.api.dtos.in.EpisodeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "EPISODE-CLIENT", url = "https://rickandmortyapi.com/api")
public interface EpisodeApiClient {
    @GetMapping("/episode/{id}")
    ResponseEntity<EpisodeDto> getEpisode(@PathVariable("id") int id);
}