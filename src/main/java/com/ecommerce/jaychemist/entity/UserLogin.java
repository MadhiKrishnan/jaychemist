package com.ecommerce.jaychemist.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserLogin {

    @Id@GeneratedValue
    private Long userLoginId;
    private String emailId;
    private String password;

    @OneToOne
    @JoinColumn(name = "partyId")
    private Party party;

    public UserLogin(String emailId, String password, Party party) {
        this.emailId = emailId;
        this.password = password;
        this.party = party;
    }
}
