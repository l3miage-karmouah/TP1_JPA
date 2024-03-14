package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.Sex;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@Table(name="netflix_user")
public class NetflixUserEntity {
    @Id
    private BigInteger id;

    private String uuid;

    private String lastname;

    private String firstname;

    @Column(length=1)
    @Enumerated(EnumType.ORDINAL)
    private Sex sex;

    private LocalDate birthDate;

    @OneToOne
    private NetflixAccountEntity account;
}
