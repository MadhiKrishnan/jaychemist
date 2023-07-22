package com.ecommerce.jaychemist.repository;

import com.ecommerce.jaychemist.entity.Party;
import com.ecommerce.jaychemist.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person,Long> {
    Person findByParty(Party party);
}
