package com.bootcamp.client.web.controller;

import com.bootcamp.client.persistence.entity.Client;
import com.bootcamp.client.persistence.mapper.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    public Flux<Client> getAll() {
        Flux<Client> clientes = clientRepository.getAll();
        return clientes;
    }
}
