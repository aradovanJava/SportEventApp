package hr.java.sport.event.sporteventapp.repository;

import hr.java.sport.event.sporteventapp.domain.Championship;
import hr.java.sport.event.sporteventapp.service.ChampionshipServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
@Primary
public class JdbcChampionshipRepository implements ChampionshipRepository {

    private JdbcTemplate jdbcTemplate;

    private ClubRepository clubRepository;

    @Override
    public List<Championship> findAll() {
        List<Championship> allChampionships =
                jdbcTemplate.query("SELECT * FROM CHAMPIONSHIP",
                        BeanPropertyRowMapper.newInstance(Championship.class));

        /*
        for(Championship c : allChampionships) {
            c.setClubList(clubRepository.findAll());
        }*/

        return allChampionships;
    }
}
