package br.com.fiap.banco.model;

import java.time.LocalDate;

public class Conta
{
    // Atributos
    private long id;
    private String numero;
    private double saldo;
    private LocalDate dataAbertura;

    private Cliente cliente;

    // Construtores
    // Cheio
    public Conta(long id, String numero, double saldo, LocalDate dataAbertura, Cliente cliente)
    {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.cliente = cliente;
    }

    // Vazio
    public Conta() {}

    // Getters & Setters
    public long getId() { return id; }
    public String getNumero() { return numero; }
    public double getSaldo() { return saldo; }
    public Cliente getCliente() { return cliente; }
    public LocalDate getDataAbertura() { return dataAbertura; }

    public void setId(long id) { this.id = id; }
    public void setNumero(String numero) { this.numero = numero; }
    public void setDataAbertura(LocalDate dataAbertura) { this.dataAbertura = dataAbertura; }


    // Métodos Workers
    public boolean sacar(double valor)
    {
        if (valor > this.saldo) { return false; }

        this.saldo -= valor;
        return true;
    }

    public void depositar(double valor)
    {
        this.saldo += valor;
    }


}
