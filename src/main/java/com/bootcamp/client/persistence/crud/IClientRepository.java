package com.bootcamp.client.persistence.crud;

import com.bootcamp.client.persistence.entity.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IClientRepository extends ReactiveMongoRepository<Client, String> {
}
