package com.ecommerce.jaychemist.repository;

import com.ecommerce.jaychemist.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends JpaRepository<Party,Long>{

}
