package com.bootcamp.client.web.controller;

import com.bootcamp.client.persistence.entity.Client;
import com.bootcamp.client.persistence.mapper.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping()
    public Flux<Client> getAll() {
        Flux<Client> clientes = clientRepository.getAll();
        return clientes;
    }
    @GetMapping("/getById/{id}")
    public Client getById(@PathVariable String id){
        Client cliente = clientRepository.getById(id).blockFirst();
        return cliente;
    }
    @PutMapping("/update")
    public Mono<Client> update(@RequestBody Client request){
        return clientRepository.update(request);
    }
}
