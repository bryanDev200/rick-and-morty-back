package com.api.controllers;

import com.api.dtos.out.CharacterDtoOut;
import com.api.services.implementation.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/characters")
@CrossOrigin(origins = "http://localhost:4200")
public class CharacterController {
    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public ResponseEntity getAllCharacters(@RequestParam(defaultValue = "1") int page) {
        return ResponseEntity.ok(characterService.getAllCharacters(page));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<CharacterDtoOut> getCharacterById(@PathVariable("id") int id) {
        CharacterDtoOut character = characterService.getCharacterById(id);
        return ResponseEntity.ok(character);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity getCharacterByName(@PathVariable("name") String name, @RequestParam(defaultValue = "1") int page) {
        return ResponseEntity.ok(characterService.getCharacterByName(page, name));
    }
}