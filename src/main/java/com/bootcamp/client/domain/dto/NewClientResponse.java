package com.bootcamp.client.domain.dto;

public class NewClientResponse extends  Response {

    private String idClient;

    public NewClientResponse(String s, String s1) {
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }


    public NewClientResponse(String idClient) {
        this.idClient = idClient;
    }



    public NewClientResponse(String codigo, String message, String idClient) {
        super(codigo, message);
        this.idClient = idClient;
    }
}
