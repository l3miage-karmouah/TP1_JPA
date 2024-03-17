package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProductEntity {
    @Id
    @Column(length=15)
    private String barCodeNumber;

    private String name;

    private Boolean consumable;

    @ManyToOne
    private BrandMiageEntity brand;
}
