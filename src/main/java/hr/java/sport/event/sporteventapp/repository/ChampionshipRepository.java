package hr.java.sport.event.sporteventapp.repository;

import hr.java.sport.event.sporteventapp.domain.Championship;

import java.util.List;

public interface ChampionshipRepository {
    List<Championship> findAll();
}
