package com.ecommerce.jaychemist.repository;

import com.ecommerce.jaychemist.entity.CustomerAddress;
import com.ecommerce.jaychemist.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepo extends JpaRepository<CustomerAddress,Long> {
    List<CustomerAddress> findAllByParty(Party party);
}
