package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="netflix_account")
public class NetflixAccountEntity {
    @Id
    private BigInteger id;

    private Integer nbDevices;

    @Enumerated(EnumType.STRING)
    private TypeAccount accountType;

    @OneToOne(mappedBy = "account")
    private NetflixUserEntity user;
}
