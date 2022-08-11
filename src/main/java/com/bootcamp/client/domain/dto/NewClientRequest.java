package com.bootcamp.client.domain.dto;

import com.bootcamp.client.persistence.entity.Client;

public class NewClientRequest  {

    private Client client;

    public NewClientRequest() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
