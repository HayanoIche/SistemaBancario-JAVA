package br.com.fiap.banco.model;

import java.time.LocalDate;

public class ContaPoupanca extends Conta
{
    // Atributos
    private int aniversario;
    private double rendimento = 0.5;

    // Construtores
    // Cheio
    public ContaPoupanca(long id, String numero, double saldo, LocalDate dataAbertura, Cliente cliente)
    {
        super(id, numero, saldo, dataAbertura, cliente);
        this.aniversario = dataAbertura.getDayOfMonth();
    }

    // Vazio
    public ContaPoupanca() {}

    // Getters & Setters
    public int getAniversario() { return aniversario; }
    public double getRendimento() { return rendimento; }

    public void setAniversario(int aniversario) { this.aniversario = aniversario; }
    public void setRendimento(double rendimento) { this.rendimento = rendimento; }
}
