package be.kdg.prog6.boundedcontextB.adapters.out;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(schema = "boundedContextB", name = "boundedContextB.parkprojection")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class TechtopiaProjectionJpaEntity {
    @Id
    private Long id;
    @Column
    private int totalPeopleInside;
}
