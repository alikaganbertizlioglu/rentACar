package alikagan.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name="brands")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//idyi otomatik arttırır
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "brand")
    List<Model> models;

}
