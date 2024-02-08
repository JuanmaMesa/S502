package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;

import java.util.List;
public interface PlayerService {
    public List<PlayerDto> getAllPlayers();
    public PlayerEntity getOnePlayer(Integer id);
    public PlayerDto updatePlayer(Integer id, PlayerDto dto);
    public PlayerDto addPlayer(PlayerDto dto);
    public void deletePlayer(Integer id);
    public PlayerDto findById(Integer id);
}