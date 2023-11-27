package hr.java.sport.event.sporteventapp.repository;

import hr.java.sport.event.sporteventapp.domain.Club;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringClubRepository extends ListCrudRepository<Club, Integer> {
}
