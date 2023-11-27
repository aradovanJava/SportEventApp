package hr.java.sport.event.sporteventapp.service;

import hr.java.sport.event.sporteventapp.domain.Club;

import java.util.List;
import java.util.Optional;

public interface ClubService {
    List<Club> findAll();
    Optional<Club> findById(Integer id);
    void update(Club updatedClub);
    void save(Club newClub);
}
