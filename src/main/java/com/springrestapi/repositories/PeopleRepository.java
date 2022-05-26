package com.springrestapi.repositories;

import com.springrestapi.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository  extends JpaRepository<Person, Integer> {
}
