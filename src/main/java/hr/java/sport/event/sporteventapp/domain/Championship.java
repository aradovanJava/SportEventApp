package hr.java.sport.event.sporteventapp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Championship {
    @Id
    private Integer id;
    private String name;
    @ManyToMany
    @JoinTable(
            name = "CHAMPIONSHIP_CLUB",
            joinColumns = @JoinColumn(name = "CHAMPIONSHIP_ID"),
            inverseJoinColumns = @JoinColumn(name = "CLUB_ID"))
    private List<Club> clubList;
}
