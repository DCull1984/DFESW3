package com.qa.puppies.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.puppies.domain.Puppy;

@Repository
public class PuppyRepo extends JpaRepository<Puppy, Integer> {

}
