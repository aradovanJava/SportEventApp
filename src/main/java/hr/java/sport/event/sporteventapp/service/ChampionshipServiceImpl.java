package hr.java.sport.event.sporteventapp.service;

import hr.java.sport.event.sporteventapp.domain.Championship;
import hr.java.sport.event.sporteventapp.repository.ChampionshipRepository;
import hr.java.sport.event.sporteventapp.repository.SpringChampionshipRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChampionshipServiceImpl implements ChampionshipService {

    private SpringChampionshipRepository championshipRepository;
    @Override
    public List<Championship> getChampionships() {
        return championshipRepository.findAll();
    }
}
