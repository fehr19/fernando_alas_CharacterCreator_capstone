package com.perscholas.ancestry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AncestryRepository extends JpaRepository<Ancestry, Integer> {

}
