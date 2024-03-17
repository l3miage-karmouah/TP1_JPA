package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.BrandType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="brand_miage")
public class BrandMiageEntity {
    @Id
    private String company_name;

    @Column(length=11)
    private String siretNumber;

    @Enumerated(EnumType.STRING)
    private BrandType type;

    @OneToMany(mappedBy = "brand")
    private Set<ProductEntity> products;

}
