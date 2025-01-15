package com.api.services;

import com.api.dtos.out.CharacterDtoOut;
import com.api.dtos.out.Response;

import java.util.List;

public interface ICharacterService {
    Response<List<CharacterDtoOut>> getAllCharacters(int page);
    CharacterDtoOut getCharacterById(int id);
    Response<List<CharacterDtoOut>> getCharacterByName(int page, String name);
}