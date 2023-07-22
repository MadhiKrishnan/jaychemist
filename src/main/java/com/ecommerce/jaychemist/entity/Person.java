package com.ecommerce.jaychemist.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Long personId;
    private String firstName;
    private String lastName;
    private String gender;
    @OneToOne
    @JoinColumn(name = "partyId")
    private Party party;

    public Person(String firstName, String lastName, String gender, Party party) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.party = party;
    }
}
