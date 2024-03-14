package com.vigitorrents.testtech.repositories;

import com.vigitorrents.testtech.entities.Signalement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignalementsRepository extends CrudRepository<Signalement, Integer> {}
