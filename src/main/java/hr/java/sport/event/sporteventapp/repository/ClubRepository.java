package hr.java.sport.event.sporteventapp.repository;

import hr.java.sport.event.sporteventapp.domain.Club;

import java.util.List;

public interface ClubRepository {
    List<Club> findAll();
    void update(Club updatedClub);

    void save(Club newClub);
}
