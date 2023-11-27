package hr.java.sport.event.sporteventapp.repository;

import hr.java.sport.event.sporteventapp.domain.Club;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
@Primary
public class JdbcClubRepository implements ClubRepository {

    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Club> findAll() {
        List<Club> allClubs =
                jdbcTemplate.query("SELECT * FROM CLUB",
                        BeanPropertyRowMapper.newInstance(Club.class));

        return allClubs;
    }

    @Override
    public void update(Club updatedClub) {

        String updateSql = "UPDATE CLUB SET NAME= ? WHERE ID = ?";

        jdbcTemplate.update(updateSql, updatedClub.getName(),
                updatedClub.getId());
    }

    @Override
    public void save(Club newClub) {
        String saveNewClubSql = "INSERT INTO CLUB(NAME) VALUES(?);";
        jdbcTemplate.update(saveNewClubSql, newClub.getName());
    }
}
