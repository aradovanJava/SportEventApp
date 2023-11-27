package hr.java.sport.event.sporteventapp.service;

import hr.java.sport.event.sporteventapp.domain.Club;
import hr.java.sport.event.sporteventapp.repository.ClubRepository;
import hr.java.sport.event.sporteventapp.repository.SpringClubRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClubServiceImpl implements ClubService {

    private SpringClubRepository clubRepository;

    @Override
    public List<Club> findAll() {
        return clubRepository.findAll();
    }

    @Override
    public Optional<Club> findById(Integer id) {
        return clubRepository.findById(id);
    }

    @Override
    public void update(Club updatedClub) {
        clubRepository.save(updatedClub);
    }

    @Override
    public void save(Club newClub) {
        clubRepository.save(newClub);
    }
}
