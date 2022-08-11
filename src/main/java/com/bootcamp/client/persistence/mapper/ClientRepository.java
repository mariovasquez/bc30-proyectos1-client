package com.bootcamp.client.persistence.mapper;

import com.bootcamp.client.persistence.crud.IClientRepository;
import com.bootcamp.client.persistence.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientRepository {
    @Autowired
    private IClientRepository dao;

    public Flux<Client> getAll(){
        Flux<Client> clientes = dao.findAll();
        return clientes;
    }

    public Flux<Client> getById(String id){
        return dao.findAll().filter(request -> request.getIdClient().equals(id));
    }

    public Mono<Client> update(Client cliente){
        return dao.save(cliente);
    }
}
