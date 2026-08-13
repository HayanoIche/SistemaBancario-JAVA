package br.com.fiap.banco.model;

public class Cliente
{
    // Atributos
    private long id;
    private String nome;
    private String telefone;

    // Construtores
    // Cheio
    public Cliente(long id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    // Vazio
    public Cliente() {}

    // Getters & Setters
    public long getId() { return id; }
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }

    public void setId(long id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}
