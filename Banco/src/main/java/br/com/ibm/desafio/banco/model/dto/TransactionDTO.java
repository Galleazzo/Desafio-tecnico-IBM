package br.com.ibm.desafio.banco.model.dto;

import br.com.ibm.desafio.banco.model.Client;

import java.time.LocalDate;

public class TransactionDTO {

    private Long id;
    private Long type;
    private double value;
    private LocalDate date;
    private Long clientId;

    public TransactionDTO(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}
