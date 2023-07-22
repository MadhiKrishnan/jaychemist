package com.ecommerce.jaychemist.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Party {

    @Id
    @GeneratedValue
    private Long partyId;
    private String partyType;

    // Other entity attributes

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", updatable = false)
    private Date createdDate;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_updated_date")
    private Date lastUpdatedDate;


    public Party(String partyType) {
        this.partyType = partyType;
    }

    public Party(String partyType, Date createdDate, Date lastUpdatedDate) {
        this.partyType = partyType;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
    }
}
