package com.api.clients;

import com.api.dtos.in.CharacterDto;
import com.api.dtos.in.RickAndMortyApiResponse;
import com.api.dtos.out.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "CHARACTER-CLIENT", url = "https://rickandmortyapi.com/api")
public interface CharacterApiClient {
    @GetMapping("/character/")
    ResponseEntity<RickAndMortyApiResponse> getCharacters(@RequestParam(defaultValue = "1") int page);
    @GetMapping("/character/{id}")
    ResponseEntity<CharacterDto> getCharacter(@PathVariable("id") int id);
    @GetMapping("/character/")
    ResponseEntity<RickAndMortyApiResponse> getCharacterByName(@RequestParam(defaultValue = "1") int page, @RequestParam("name") String name);
}