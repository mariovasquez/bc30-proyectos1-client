package com.bootcamp.client.domain.dto;

public class Response {





    private String codigo;
    private String message;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Response() {



    }

    public Response(String codigo, String message) {
        this.codigo = codigo;
        this.message = message;
    }
}
