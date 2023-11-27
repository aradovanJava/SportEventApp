package hr.java.sport.event.sporteventapp.repository;

import hr.java.sport.event.sporteventapp.domain.Championship;
import hr.java.sport.event.sporteventapp.domain.Club;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class MockChampionshipRepository implements ChampionshipRepository {

    private ClubRepository clubRepository;

    private static final List<Championship> championshipList = new ArrayList<>();

    static {
        Championship newChampionship = new Championship();
        newChampionship.setName("Hrvatska nogometna liga");
        championshipList.add(newChampionship);
    }
    @Override
    public List<Championship> findAll() {
        /*
        for(Championship championship : championshipList) {
            championship.setClubList(clubRepository.findAll());
        }

         */
        return championshipList;
    }
}
