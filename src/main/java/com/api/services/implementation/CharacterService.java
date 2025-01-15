package com.api.services.implementation;

import com.api.clients.CharacterApiClient;
import com.api.clients.EpisodeApiClient;
import com.api.dtos.in.CharacterDto;
import com.api.dtos.in.EpisodeDto;
import com.api.dtos.in.RickAndMortyApiResponse;
import com.api.dtos.out.CharacterDtoOut;
import com.api.dtos.out.Response;
import com.api.dtos.out.ResponseInfoDto;
import com.api.exceptions.CharacterNotFoundException;
import com.api.exceptions.EpisodeNotFoundException;
import com.api.services.ICharacterService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService implements ICharacterService {
    private final CharacterApiClient characterClient;
    private final EpisodeApiClient episodeClient;

    public CharacterService(CharacterApiClient characterClient, EpisodeApiClient episodeClient) {
        this.characterClient = characterClient;
        this.episodeClient = episodeClient;
    }

    @Override
    public Response<List<CharacterDtoOut>> getAllCharacters(int page) {
        ResponseEntity<RickAndMortyApiResponse> characterResponse = characterClient.getCharacters(page);
        if(characterResponse.getStatusCode().is4xxClientError()) {
            throw new CharacterNotFoundException("No se encontraron personajes");
        }
        RickAndMortyApiResponse response = characterResponse.getBody();
        List<CharacterDtoOut> characters = response.getResults().parallelStream().map(characterDto -> {
            ResponseEntity<EpisodeDto> episodeResponse = episodeClient.getEpisode(getEpisodeIdFromUrl(characterDto.getEpisode()[0]));
            if(episodeResponse.getStatusCode().is4xxClientError()) {
                throw new EpisodeNotFoundException("No existe el episodio");
            }
            EpisodeDto episodeDto = episodeResponse.getBody();

            CharacterDtoOut character = new CharacterDtoOut.Builder()
                    .setId(characterDto.getId())
                    .setName(characterDto.getName())
                    .setStatus(characterDto.getStatus())
                    .setLocation(characterDto.getLocation().getName())
                    .setEpisode(episodeDto.getName())
                    .setImage(characterDto.getImage())
                    .build();
            return character;
        }).toList();

        ResponseInfoDto info = new ResponseInfoDto(
                response.getInfo().getCount(), response.getInfo().getPages(),
                response.getInfo().getNext(), response.getInfo().getPrev());

        return new Response<List<CharacterDtoOut>>(info, characters);
    }

    @Override
    public CharacterDtoOut getCharacterById(int id) {
        ResponseEntity<CharacterDto> characterResponse = characterClient.getCharacter(id);
        if(characterResponse.getStatusCode().is4xxClientError()) {
            throw new CharacterNotFoundException("No se encontraron personajes");
        }
        CharacterDto characterDto = characterResponse.getBody();
        ResponseEntity<EpisodeDto> episodeResponse = episodeClient.getEpisode(getEpisodeIdFromUrl(characterDto.getEpisode()[0]));
        if(episodeResponse.getStatusCode().is4xxClientError()) {
            throw new EpisodeNotFoundException("No existe el episodio");
        }
        EpisodeDto episodeDto = episodeResponse.getBody();

        CharacterDtoOut character = new CharacterDtoOut.Builder()
                .setId(characterDto.getId())
                .setName(characterDto.getName())
                .setStatus(characterDto.getStatus())
                .setLocation(characterDto.getLocation().getName())
                .setEpisode(episodeDto.getName())
                .setImage(characterDto.getImage())
                .build();
        return character;
    }

    @Override
    public Response<List<CharacterDtoOut>> getCharacterByName(int page, String name) {
        ResponseEntity<RickAndMortyApiResponse> characterResponse = characterClient.getCharacterByName(page, name);
        if(characterResponse.getStatusCode().is4xxClientError()) {
            throw new CharacterNotFoundException("No se encontraron personajes");
        }
        RickAndMortyApiResponse response = characterResponse.getBody();
        List<CharacterDtoOut> characters = response.getResults().parallelStream().map(characterDto -> {
            ResponseEntity<EpisodeDto> episodeResponse = episodeClient.getEpisode(getEpisodeIdFromUrl(characterDto.getEpisode()[0]));
            if(episodeResponse.getStatusCode().is4xxClientError()) {
                throw new EpisodeNotFoundException("No existe el episodio");
            }
            EpisodeDto episodeDto = episodeResponse.getBody();

            CharacterDtoOut character = new CharacterDtoOut.Builder()
                    .setId(characterDto.getId())
                    .setName(characterDto.getName())
                    .setStatus(characterDto.getStatus())
                    .setLocation(characterDto.getLocation().getName())
                    .setEpisode(episodeDto.getName())
                    .setImage(characterDto.getImage())
                    .build();
            return character;
        }).toList();

        ResponseInfoDto info = new ResponseInfoDto(
                response.getInfo().getCount(), response.getInfo().getPages(),
                response.getInfo().getNext(), response.getInfo().getPrev());

        return new Response<List<CharacterDtoOut>>(info, characters);
    }

    private int getEpisodeIdFromUrl(String url) {
        String[] urlSplitted = url.split("/");
        return Integer.parseInt(urlSplitted[urlSplitted.length - 1]);
    }
}