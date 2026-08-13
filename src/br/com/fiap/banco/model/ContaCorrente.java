package br.com.fiap.banco.model;

import java.time.LocalDate;

public class ContaCorrente extends Conta
{
    // Atributos
    private double manutencao;

    // Construtores
    // Cheio
    public ContaCorrente(long id, String numero, double saldo, LocalDate dataAbertura, Cliente cliente) {
        super(id, numero, saldo, dataAbertura, cliente);
        manutencao = 25.00;
    }

    // Vazio
    public ContaCorrente() {
        this.manutencao = 25.00;
    }

    // Getters & Setters
    public double getManutencao() { return manutencao; }
    public void setManutencao(double manutencao) { this.manutencao = manutencao; }

}
