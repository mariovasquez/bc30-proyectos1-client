package com.bootcamp.client.persistence.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="client")
public class Client {

    @Id
    private String id;
    private String idClient;
    private String typeClient;
    private String legalRepresentative;
    private String[] Products;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Client() {
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(String typeClient) {
        this.typeClient = typeClient;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public String[] getProducts() {
        return Products;
    }

    public void setProducts(String[] products) {
        Products = products;
    }
}
