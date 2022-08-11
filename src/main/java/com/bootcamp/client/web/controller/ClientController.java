package com.bootcamp.client.web.controller;

import com.bootcamp.client.domain.dto.NewClientRequest;
import com.bootcamp.client.domain.dto.NewClientResponse;
import com.bootcamp.client.persistence.entity.Client;
import com.bootcamp.client.persistence.mapper.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    public Flux<Client> getAll() {
        Flux<Client> clientes = clientRepository.getAll();
        return clientes;
    }


    @PostMapping("/new-client")
    public Mono<NewClientResponse> newClient(@RequestBody NewClientRequest request){

      Mono<NewClientResponse> responseEntityMono  =
              clientRepository.newClient(request.getClient()).map(x ->    new NewClientResponse("0","Cliente creado",x.getId() ))
                    .defaultIfEmpty(  new  NewClientResponse("-1", "Ocurrio un error inesperado", ""));

        return responseEntityMono;

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
