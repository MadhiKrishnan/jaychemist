package com.ecommerce.jaychemist.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerAddress {
    @Id
    @GeneratedValue
    private Long id;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private int pincode;
    @OneToOne
    @JoinColumn(name = "partyId")
    private Party party;

    public CustomerAddress(String address1, String address2, String city, String state, int pincode, Party party) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.party = party;
    }

}
