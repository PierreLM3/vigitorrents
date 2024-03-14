package com.vigitorrents.testtech.repositories;

import com.vigitorrents.testtech.entities.Subscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionsRepository extends CrudRepository<Subscription, Integer> {}
