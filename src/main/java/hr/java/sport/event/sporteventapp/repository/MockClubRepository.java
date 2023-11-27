package hr.java.sport.event.sporteventapp.repository;

import hr.java.sport.event.sporteventapp.domain.Championship;
import hr.java.sport.event.sporteventapp.domain.Club;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
//@Primary
public class MockClubRepository implements ClubRepository {

    private static List<Club> championshipClubs = new ArrayList<>();

    static {

        Championship championship = new Championship(1, "HNL", new ArrayList<>());

        Club firstClub = new Club(1, "Dinamo Zagreb");
        Club secondClub = new Club(2, "HNK Rijeka");

        championshipClubs.add(firstClub);
        championshipClubs.add(secondClub);
    }

    @Override
    public List<Club> findAll() {
        return championshipClubs;
    }

    @Override
    public void update(Club updatedClub) {
        Optional<Club> clubOptional = championshipClubs.stream().filter(c -> c.getId().equals(
                updatedClub.getId())).findFirst();

        if(clubOptional.isPresent()) {
            Club clubToUpdate = clubOptional.get();
            clubToUpdate.setName(updatedClub.getName());
        }
    }

    @Override
    public void save(Club newClub) {
        championshipClubs.add(newClub);
    }
}
